//将从form中通过$('#form').serialize()获取的值转成json
 var DataDeal = {
     formToJson: function (data) {
         data = data.replace(/&/g, "\",\"");
         data = data.replace(/=/g, "\":\"");
         data = "{\"" + data + "\"}";
         return data;
     },
 };

jQuery.validator.addMethod("isTel", function(value,element) {
    var length = value.length;
    var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
    var tel = /^(\d{3,4}-?)?\d{7,9}$/g;
    return this.optional(element) || tel.test(value) || (length==11 && mobile.test(value));
}, "请正确填写您的联系方式");

function StringBuffer() {
    this.__strings__ = [];
};
StringBuffer.prototype.append = function(str) {
    this.__strings__.push(str);
};
StringBuffer.prototype.toString = function() {
    return this.__strings__.join('');
};