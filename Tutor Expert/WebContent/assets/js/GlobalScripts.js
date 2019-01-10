function isFloat(txtID) {
    var text = document.getElementById(txtID.id).value;
    var i = 0;
    var EventCode = event.keyCode;
    if (EventCode == 46) {
        for (i = 0; i < text.length; i++) {
            if (EventCode == text.charCodeAt(i)) {
                return false;
            }
        }
    }
    if (event.keyCode == 46 || (event.keyCode >= 48 && event.keyCode <= 57))
        return true;
    else
        return false;
}
function isInteger() {
    var EventCode = event.keyCode;
    if (EventCode >= 48 && EventCode <= 57)
        return true;
    else

        return false;
}
function ValidateAlpha() {
    var keyCode = event.keyCode;
    if ((keyCode < 65 || keyCode > 90) && (keyCode < 97 || keyCode > 123) && keyCode != 32)
        return false;
    return true;
}