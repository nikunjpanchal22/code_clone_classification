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
    if (control is ITextBox) {
        return ((ITextBox) control).Text;
    } else if (control is ICheckBox) {
        return ((ICheckBox) control).Checked.ToString ();
    } else {
        return null;
    }
}
