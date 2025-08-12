public void DisableForm (ControlCollection ctrls) {
    foreach (Control ctrl in ctrls) {
        if (ctrl is TextBox)
            ((TextBox) ctrl).Enabled = false;
        if (ctrl is Button)
            ((Button) ctrl).Enabled = false;
        else if (ctrl is DropDownList)
            ((DropDownList) ctrl).Enabled = false;
        else if (ctrl is CheckBox)
            ((CheckBox) ctrl).Enabled = false;
        else if (ctrl is RadioButton)
            ((RadioButton) ctrl).Enabled = false;
        else if (ctrl is HtmlInputButton)
            ((HtmlInputButton) ctrl).Disabled = true;
        else if (ctrl is HtmlInputText)
            ((HtmlInputText) ctrl).Disabled = true;
        else if (ctrl is HtmlSelect)
            ((HtmlSelect) ctrl).Disabled = true;
        else if (ctrl is HtmlInputCheckBox)
            ((HtmlInputCheckBox) ctrl).Disabled = true;
        else if (ctrl is HtmlInputRadioButton)
            ((HtmlInputRadioButton) ctrl).Disabled = true;
        DisableForm (ctrl.Controls);
    }
}




public void DisableForm(ControlCollection ctrls) {
    ctrls.Cast<Control>().ToList().ForEach(ctrl => {
        if (ctrl is TextBox txt)
            txt.Enabled = false;
        else if (ctrl is Button btn)
            btn.Enabled = false;
        // Handle rest of the control types similarly
        DisableForm(ctrl.Controls);
    });
}


