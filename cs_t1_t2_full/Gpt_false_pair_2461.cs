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


 public void DisableForm (ControlCollection ctrls) {
    foreach (Control ctrl in ctrls) {
        List<Type> types =  ctrls
            .Where( c => c is TextBox 
            || c is Button
            || c is DropDownList
            || c is CheckBox
            || c is RadioButton
            || c is HtmlInputButton
            || c is HtmlInputText
            || c is HtmlSelect
            || c is HtmlInputCheckBox
            || c is HtmlInputRadioButton)
            .Select(c => c.GetType()).ToList();

        if(types.Contains(ctrl.GetType()))
        {
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
        }
        DisableForm (ctrl.Controls);
    }
}
