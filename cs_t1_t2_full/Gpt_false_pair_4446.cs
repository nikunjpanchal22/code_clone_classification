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
    if (control is ITextControl) {
        return ((ITextControl) control).Text;
    } else if (control is ICheckBoxControl) {
        return ((ICheckBoxControl) control).Checked.ToString ();
    } else if (control is IRadioButtonControl) {
        return ((IRadioButtonControl) control).Checked.ToString ();
    } else {
        return null;
    }
}
