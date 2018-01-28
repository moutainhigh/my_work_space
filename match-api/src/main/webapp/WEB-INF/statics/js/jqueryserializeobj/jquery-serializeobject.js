/*
 * Serialize a form to json object
 * see: http://stackoverflow.com/questions/1184624/convert-form-data-to-javascript-object-with-jquery
 * 	and http://jsfiddle.net/sxGtM/3/
 */
$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
