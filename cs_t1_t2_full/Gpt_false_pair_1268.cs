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
    if (control is ITextView) {
        return ((ITextView) control).Text;
    } else if (control is ICheckBoxView) {
        return ((ICheckBoxView) control).Checked.ToString ();
    } else {
        return null;
    }
}
