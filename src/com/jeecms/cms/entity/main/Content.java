package com.jeecms.cms.entity.main;

import static com.jeecms.common.web.Constants.SPT;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.jeecms.cms.entity.assist.CmsComment;
import com.jeecms.cms.entity.main.Channel.AfterCheckEnum;
import com.jeecms.cms.entity.main.base.BaseContent;
import com.jeecms.cms.staticpage.StaticPageUtils;
import com.jeecms.cms.web.CmsThreadVariable;
import com.jeecms.core.web.ContentInterface;

public class Content extends BaseContent implements ContentInterface {
	private static final long serialVersionUID = 1L;

	/**
	 * 状态
	 */
	public enum ContentStatus {
		/**
		 * 所有
		 */
		all,
		/**
		 * 草稿
		 */
		draft,
		/**
		 * 待审核
		 */
		prepared,
		/**
		 * 已审
		 */
		passed,
		/**
		 * 终审
		 */
		checked,
		/**
		 * 退回
		 */
		rejected,
		/**
		 * 回收
		 */
		recycle
	};

	private DateFormat df = new SimpleDateFormat("/yyyyMMdd");

	public Boolean getStaticContent() {
		Channel channel = getChannel();
		if (channel != null) {
			return channel.getStaticContent();
		} else {
			return null;
		}
	}

	/**
	 * 获得URL地址
	 * 
	 * @return
	 */
	public String getUrl() {
		if (!StringUtils.isBlank(getLink())) {
			return getLink();
		}
		if (getStaticContent()) {
			return getUrlStatic(false, 1);
		} else {
			return getUrlDynamic(null);
		}
	}

	public String getUrlWhole() {
		if (!StringUtils.isBlank(getLink())) {
			return getLink();
		}
		if (getStaticContent()) {
			return getUrlStatic(true, 1);
		} else {
			return getUrlDynamic(true);
		}

	}

	public String getUrlStatic() {
		return getUrlStatic(null, 1);
	}

	public String getUrlStatic(int pageNo) {
		return getUrlStatic(null, pageNo);
	}

	public String getUrlStatic(Boolean whole, int pageNo) {
		if (!StringUtils.isBlank(getLink())) {
			return getLink();
		}
		CmsSite site = getSite();
		StringBuilder url = site.getUrlBuffer(false, whole, false);
		String filename = getStaticFilenameByRule();
		if (!StringUtils.isBlank(filename)) {
			if (pageNo > 1) {
				int index = filename.indexOf(".", filename.lastIndexOf("/"));
				if (index != -1) {
					url.append(filename.subSequence(0, index)).append("_");
					url.append(pageNo).append(
							filename.subSequence(index, filename.length()));
				} else {
					url.append(filename).append("_").append(pageNo);
				}
			} else {
				url.append(filename);
			}
		} else {
			// 默认静态路径
			url.append(SPT).append(getChannel().getPath());
			url.append(df.format(getReleaseDate()));
			url.append(SPT).append(getId());
			if (pageNo > 1) {
				url.append("_").append(pageNo);
			}
			url.append(site.getStaticSuffix());

		}
		return url.toString();
	}

	public String getUrlDynamic() {
		return getUrlDynamic(null);
	}

	public String getStaticFilename(int pageNo) {
		CmsSite site = getSite();
		StringBuilder url = new StringBuilder();
		String staticDir = site.getStaticDir();
		if (!StringUtils.isBlank(staticDir)) {
			url.append(staticDir);
		}
		String filename = getStaticFilenameByRule();
		if (!StringUtils.isBlank(filename)) {
			int index = filename.indexOf(".", filename.lastIndexOf("/"));
			if (pageNo > 1) {
				if (index != -1) {
					url.append(filename.substring(0, index));
					url.append("_").append(pageNo);
					url.append(filename.substring(index));
				} else {
					url.append(filename).append("_").append(pageNo);
				}
			} else {
				url.append(filename);
			}
		} else {
			// 默认静态路径
			url.append(SPT).append(getChannel().getPath());
			url.append(df.format(getReleaseDate()));
			url.append(SPT).append(getId());
			if (pageNo > 1) {
				url.append("_").append(pageNo);
			}
			url.append(site.getStaticSuffix());
		}
		return url.toString();
	}

	public String getStaticFilenameByRule() {
		Channel channel = getChannel();
		CmsModel model = channel.getModel();
		String rule = channel.getContentRule();
		if (StringUtils.isBlank(rule)) {
			return null;
		}
		String url = StaticPageUtils.staticUrlRule(rule, model.getId(), model
				.getPath(), channel.getId(), channel.getPath(), getId(),
				getReleaseDate());
		return url;
	}

	public String getUrlDynamic(Boolean whole) {
		if (!StringUtils.isBlank(getLink())) {
			return getLink();
		}
		CmsSite site = getSite();
		StringBuilder url = site.getUrlBuffer(true, whole, false);
		url.append(SPT).append(getChannel().getPath());
		url.append(SPT).append(getId()).append(site.getDynamicSuffix());
		return url.toString();
	}

	public Set<Channel> getChannelsWithoutMain() {
		Set<Channel> set = new HashSet<Channel>(getChannels());
		set.remove(getChannel());
		return set;
	}

	public void setContentTxt(ContentTxt txt) {
		Set<ContentTxt> set = getContentTxtSet();
		if (set == null) {
			set = new HashSet<ContentTxt>();
			setContentTxtSet(set);
		}
		if (!set.isEmpty()) {
			set.clear();
		}
		set.add(txt);
	}

	public void setContentCheck(ContentCheck check) {
		Set<ContentCheck> set = getContentCheckSet();
		if (set == null) {
			set = new HashSet<ContentCheck>();
			setContentCheckSet(set);
		}
		if (!set.isEmpty()) {
			set.clear();
		}
		set.add(check);
	}

	public void addToChannels(Channel channel) {
		Set<Channel> channels = getChannels();
		if (channels == null) {
			channels = new HashSet<Channel>();
			setChannels(channels);
		}
		channels.add(channel);
	}

	public void addToTopics(CmsTopic topic) {
		Set<CmsTopic> topics = getTopics();
		if (topics == null) {
			topics = new HashSet<CmsTopic>();
			setTopics(topics);
		}
		topics.add(topic);
	}

	public void addToGroups(CmsGroup group) {
		Set<CmsGroup> groups = getViewGroups();
		if (groups == null) {
			groups = new HashSet<CmsGroup>();
			setViewGroups(groups);
		}
		groups.add(group);
	}

	public void addToAttachmemts(String path, String name, String filename) {
		List<ContentAttachment> list = getAttachments();
		if (list == null) {
			list = new ArrayList<ContentAttachment>();
			setAttachments(list);
		}
		ContentAttachment ca = new ContentAttachment(path, name, 0);
		if (!StringUtils.isBlank(filename)) {
			ca.setFilename(filename);
		}
		list.add(ca);
	}

	public void addToPictures(String path, String desc) {
		List<ContentPicture> list = getPictures();
		if (list == null) {
			list = new ArrayList<ContentPicture>();
			setPictures(list);
		}
		ContentPicture cp = new ContentPicture();
		cp.setImgPath(path);
		cp.setDescription(desc);
		list.add(cp);
	}

	public String getTagStr() {
		List<ContentTag> tags = getTags();
		if (tags != null && tags.size() > 0) {
			StringBuilder sb = new StringBuilder();
			for (ContentTag tag : tags) {
				sb.append(tag.getName()).append(',');
			}
			return sb.substring(0, sb.length() - 1);
		} else {
			return null;
		}
	}

	/**
	 * 是否草稿
	 * 
	 * @return
	 */
	public boolean isDraft() {
		return ContentCheck.DRAFT == getStatus();
	}

	/**
	 * 是否终审通过
	 * 
	 * @return
	 */
	public boolean isChecked() {
		return ContentCheck.CHECKED == getStatus();
	}

	public Set<CmsGroup> getViewGroupsExt() {
		Set<CmsGroup> set = getViewGroups();
		if (set != null && set.size() > 0) {
			return set;
		} else {
			return getChannel().getViewGroups();
		}
	}

	public String getTplContentOrDef() {
		String tpl = getTplContent();
		if (!StringUtils.isBlank(tpl)) {
			return tpl;
		} else {
			return getChannel().getTplContentOrDef(getModel());
		}
	}

	/**
	 * 是否有审核后的编辑权限。从CmsThread中获得当前用户。
	 * 
	 * @return
	 */
	public boolean isHasUpdateRight() {
		CmsUser user = CmsThreadVariable.getUser();
		if (user == null) {
			throw new IllegalStateException("CmsUser not found in CmsThread");
		}
		return isHasUpdateRight(user);
	}

	/**
	 * 是否有审核后的编辑权限
	 * 
	 * @param user
	 * @return
	 */
	public boolean isHasUpdateRight(CmsUser user) {
		AfterCheckEnum after = getChannel().getAfterCheckEnum();
		if (AfterCheckEnum.CANNOT_UPDATE == after) {
			CmsSite site = getSite();
			Byte userStep = user.getCheckStep(site.getId());
			Byte channelStep = getChannel().getFinalStepExtends();
			boolean checked = getStatus() == ContentCheck.CHECKED;
			// 如果内容审核级别大于用户审核级别，或者内容已经审核且用户审核级别小于栏目审核级别。
			if (getCheckStep() > userStep
					|| (checked && userStep < channelStep)) {
				return false;
			} else {
				return true;
			}
		} else if (AfterCheckEnum.BACK_UPDATE == after
				|| AfterCheckEnum.KEEP_UPDATE == after) {
			return true;
		} else {
			throw new RuntimeException("AfterCheckEnum '" + after
					+ "' did not handled");
		}
	}

	/**
	 * 是否有审核后的删除权限。从CmsThread中获得当前用户。
	 * 
	 * @return
	 */
	public boolean isHasDeleteRight() {
		CmsUser user = CmsThreadVariable.getUser();
		if (user == null) {
			throw new IllegalStateException("CmsUser not found in CmsThread");
		}
		return isHasDeleteRight(user);
	}

	/**
	 * 是否有审核后的删除权限
	 * 
	 * @param user
	 * @return
	 */
	public boolean isHasDeleteRight(CmsUser user) {
		AfterCheckEnum after = getChannel().getAfterCheckEnum();
		if (AfterCheckEnum.CANNOT_UPDATE == after) {
			CmsSite site = getSite();
			Byte userStep = user.getCheckStep(site.getId());
			Byte channelStep = getChannel().getFinalStepExtends();
			boolean checked = getStatus() == ContentCheck.CHECKED;
			// 如果内容审核级别大于用户审核级别，或者内容已经审核且用户审核级别小于栏目审核级别。
			if (getCheckStep() > userStep
					|| (checked && userStep < channelStep)) {
				return false;
			} else {
				return true;
			}
		} else if (AfterCheckEnum.BACK_UPDATE == after
				|| AfterCheckEnum.KEEP_UPDATE == after) {
			return true;
		} else {
			throw new RuntimeException("AfterCheckEnum '" + after
					+ "' did not handled");
		}

	}

	public void init() {
		short zero = 0;
		byte bzero = 0;
		if (getViewsDay() == null) {
			setViewsDay(0);
		}
		if (getCommentsDay() == null) {
			setCommentsDay(zero);
		}
		if (getDownloadsDay() == null) {
			setDownloadsDay(zero);
		}
		if (getUpsDay() == null) {
			setUpsDay(zero);
		}
		if (getHasTitleImg() == null) {
			setHasTitleImg(false);
		}
		if (getRecommend() == null) {
			setRecommend(false);
		}
		if (getSortDate() == null) {
			setSortDate(new Timestamp(System.currentTimeMillis()));
		}
		if (getTopLevel() == null) {
			setTopLevel(bzero);
		}
		// 保存后立即生成静态化，如果这些值为null，则需要在模板中增加判断，使模板编写变得复杂。
		if (getChannels() == null) {
			setChannels(new HashSet<Channel>());
		}
		if (getTopics() == null) {
			setTopics(new HashSet<CmsTopic>());
		}
		if (getViewGroups() == null) {
			setViewGroups(new HashSet<CmsGroup>());
		}
		if (getTags() == null) {
			setTags(new ArrayList<ContentTag>());
		}
		if (getPictures() == null) {
			setPictures(new ArrayList<ContentPicture>());
		}
		if (getAttachments() == null) {
			setAttachments(new ArrayList<ContentAttachment>());
		}
	}

	public int getPageCount() {
		int txtCount = getTxtCount();
		if (txtCount <= 1) {
			List<ContentPicture> pics = getPictures();
			if (pics != null) {
				int picCount = pics.size();
				if (picCount > 1) {
					return picCount;
				}
			}
		}
		return txtCount;
	}

	public int getTxtCount() {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxtCount();
		} else {
			return 1;
		}
	}

	public ContentPicture getPictureByNo(int pageNo) {
		List<ContentPicture> list = getPictures();
		if (pageNo >= 1 && list != null && list.size() >= pageNo) {
			return list.get(pageNo - 1);
		} else {
			return null;
		}
	}

	public String getTxtByNo(int pageNo) {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxtByNo(pageNo);
		} else {
			return null;
		}
	}

	public String getTitleByNo(int pageNo) {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTitleByNo(pageNo);
		} else {
			return getTitle();
		}
	}

	public String getStitle() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getStitle();
		} else {
			return null;
		}
	}

	public String getTitle() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getTitle();
		} else {
			return null;
		}
	}

	public String getShortTitle() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getShortTitle();
		} else {
			return null;
		}
	}

	public String getDescription() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getDescription();
		} else {
			return null;
		}
	}

	public String getAuthor() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getAuthor();
		} else {
			return null;
		}
	}

	public String getOrigin() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getOrigin();
		} else {
			return null;
		}
	}

	public String getOriginUrl() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getOriginUrl();
		} else {
			return null;
		}
	}

	public Date getReleaseDate() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getReleaseDate();
		} else {
			return null;
		}
	}

	public String getMediaPath() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getMediaPath();
		} else {
			return null;
		}
	}

	public String getMediaType() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getMediaType();
		} else {
			return null;
		}
	}

	public String getTitleColor() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getTitleColor();
		} else {
			return null;
		}
	}

	public Boolean getBold() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getBold();
		} else {
			return null;
		}
	}

	public String getTitleImg() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getTitleImg();
		} else {
			return null;
		}
	}

	public String getContentImg() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getContentImg();
		} else {
			return null;
		}
	}

	public String getTypeImg() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getTypeImg();
		} else {
			return null;
		}
	}

	public String getLink() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getLink();
		} else {
			return null;
		}
	}

	public String getTplContent() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getTplContent();
		} else {
			return null;
		}
	}
	
	public Boolean getNeedRegenerate() {
		ContentExt ext = getContentExt();
		if (ext != null) {
			return ext.getNeedRegenerate();
		} else {
			return null;
		}
	}
	
	public void setNeedRegenerate(Boolean isNeed) {
		ContentExt ext = getContentExt();
		if (ext != null) {
			ext.setNeedRegenerate(isNeed);
		}
	}

	public String getTxt() {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxt();
		} else {
			return null;
		}
	}

	public String getTxt1() {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxt1();
		} else {
			return null;
		}
	}

	public String getTxt2() {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxt2();
		} else {
			return null;
		}
	}

	public String getTxt3() {
		ContentTxt txt = getContentTxt();
		if (txt != null) {
			return txt.getTxt3();
		} else {
			return null;
		}
	}

	public Integer getViews() {
		ContentCount count = getContentCount();
		if (count != null) {
			return count.getViews();
		} else {
			return null;
		}
	}

	public Integer getCommentsCount() {
		ContentCount count = getContentCount();
		if (count != null) {
			return count.getComments();
		} else {
			return null;
		}
	}
	
	public Integer getCommentsCheckedNum() {
		Set<CmsComment> comments = getComments();
		int num=0;
		if (comments != null) {
			for(CmsComment comment:comments){
				if(comment.getChecked()){
					num++;
				}
			}
			return num;
		} else {
			return 0;
		}
	}

	public Integer getUps() {
		ContentCount count = getContentCount();
		if (count != null) {
			return count.getUps();
		} else {
			return null;
		}
	}

	public Integer getDowns() {
		ContentCount count = getContentCount();
		if (count != null) {
			return count.getDowns();
		} else {
			return null;
		}
	}

	public Byte getCheckStep() {
		ContentCheck check = getContentCheck();
		if (check != null) {
			return check.getCheckStep();
		} else {
			return null;
		}
	}

	public String getCheckOpinion() {
		ContentCheck check = getContentCheck();
		if (check != null) {
			return check.getCheckOpinion();
		} else {
			return null;
		}
	}

	public Boolean getRejected() {
		ContentCheck check = getContentCheck();
		if (check != null) {
			return check.getRejected();
		} else {
			return null;
		}
	}

	public ContentTxt getContentTxt() {
		Set<ContentTxt> set = getContentTxtSet();
		if (set != null && set.size() > 0) {
			return set.iterator().next();
		} else {
			return null;
		}
	}

	public ContentCheck getContentCheck() {
		Set<ContentCheck> set = getContentCheckSet();
		if (set != null && set.size() > 0) {
			return set.iterator().next();
		} else {
			return null;
		}
	}

	public String getDesc() {
		return getDescription();
	}

	public String getCtgName() {
		return getChannel().getName();
	}

	public String getCtgUrl() {
		return getChannel().getUrl();
	}

	public String getImgUrl() {
		return getTitleImg();
	}

	public String getImgUrl2() {
		return getTypeImg();
	}

	public String getStit() {
		String stit = getShortTitle();
		if (!StringUtils.isBlank(stit)) {
			return stit;
		} else {
			return getTit();
		}
	}

	public String getTit() {
		return getTitle();
	}

	public String getTitCol() {
		return getTitleColor();
	}

	public String getSiteName() {
		return getSite().getName();
	}

	public String getSiteUrl() {
		return getSite().getUrl();
	}
	
	public String getCompanyName(){
		return getSite().getSiteCompany().getName();
	}
	
	public String getCompanyAddr(){
		return getSite().getSiteCompany().getAddress();
	}
	
	public String getCompanyScale(){
		return getSite().getSiteCompany().getScale();
	}
	
	public String getCompanyNature(){
		return getSite().getSiteCompany().getNature();
	}
	
	public String getCompanyIndustry(){
		return getSite().getSiteCompany().getIndustry();
	}
	
	public String getCompanyDesc(){
		return getSite().getSiteCompany().getDescription();
	}
	
	public String getCompanyContact(){
		return getSite().getSiteCompany().getContact();
	}

	public boolean isTitBold() {
		return getBold();
	}

	public Date getDate() {
		return getReleaseDate();
	}

	public Boolean getTarget() {
		return null;
	}
	
	public void clear(){
		getCollectUsers().clear();
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Content() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Content(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Content(Integer id,
			CmsSite site, Date sortDate,
			Byte topLevel, Boolean hasTitleImg,
			Boolean recommend, Byte status,
			Integer viewsDay, Short commentsDay,
			Short downloadsDay, Short upsDay) {

		super(id, site, sortDate, topLevel, hasTitleImg, recommend, status,
				viewsDay, commentsDay, downloadsDay, upsDay);
	}

	/* [CONSTRUCTOR MARKER END] */

}