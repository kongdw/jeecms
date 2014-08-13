function scrollDoor() {
}
scrollDoor.prototype = {
    sd: function (menus, divs, openClass, closeClass) {
        var _this = this;
        if (menus.length != divs.length) {
            alert("菜单层数量和内容层数量不一样!");
            return false;
        }
//alert(menus.length);
        for (var i = 0; i < menus.length; i++) {
            _this.$(menus[i]).value = i;
            _this.$(menus[i]).onmouseover = function () {
                for (var j = 0; j < menus.length; j++) {
                    _this.$(menus[j]).className = closeClass;
                    _this.$(divs[j]).style.display = "none";
                }
                _this.$(menus[this.value]).className = openClass;
                _this.$(divs[this.value]).style.display = "block";
            }
        }
    },
    $: function (oid) {
        if (typeof(oid) == "string")
            return document.getElementById(oid);
        return oid;
    }
}

function getClock() {
    var today  = new Date();
    var isnMonth = new
        Array("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月");
    var isnDay = new
        Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日");
    var curYear = today.getFullYear();
    var curDate = today.getDate();
    document.write("" + curYear + "年" + isnMonth[today.getMonth()] + curDate + "日 " + isnDay[today.getDay()]);
}
