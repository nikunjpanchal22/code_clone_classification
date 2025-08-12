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
    if (control is TextControlView) {
        return ((TextControlView) control).Value;
    } else if (control is CheckboxControlView) {
        return ((CheckboxControlView) control).Checked.ToString ();
    } else {
        return null;
    }
}
