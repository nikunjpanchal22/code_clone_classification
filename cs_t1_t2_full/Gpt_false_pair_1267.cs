private string GetControlValue (string controlId) {
    var control = FindControl (controlId);
    if (control is ITextControl) {
        return ((ITextControl) control).Text;
    } else if (control is ICheckBoxControl) {
        return ((ICheckBoxControl) control).Checked.ToString ();
    } else {
        return null;
    }
}


 private string GetControlValue (string controlId) {
    var control = FindControl (controlId);
    if (control is TextInputView) {
        return ((TextInputView) control).Text;
    } else if (control is CheckBoxInputView) {
        return ((CheckBoxInputView) control).Checked.ToString ();
    } else {
        return null;
    }
}
