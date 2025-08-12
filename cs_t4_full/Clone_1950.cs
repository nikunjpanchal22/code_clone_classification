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
        switch (ctrl.GetType().ToString())
        {
            case "System.Web.UI.WebControls.TextBox":
                ctrl.Enabled = false;
                break;
            case "System.Web.UI.WebControls.Button":
                ctrl.Enabled = false;
                break;
            case "System.Web.UI.WebControls.DropDownList":
                ctrl.Enabled = false;
                break;
            case "System.Web.UI.WebControls.CheckBox":
                ctrl.Enabled = false;
                break;
            case "System.Web.UI.WebControls.RadioButton":
                ctrl.Enabled = false;
                break;
            case "System.Web.UI.HtmlControls.HtmlInputButton":
                ctrl.Disabled = true;
                break;
            case "System.Web.UI.HtmlControls.HtmlInputText":
                ctrl.Disabled = true;
                break;
            case "System.Web.UI.HtmlControls.HtmlSelect":
                ctrl.Disabled = true;
                break;
            case "System.Web.UI.HtmlControls.HtmlInputCheckBox":
                ctrl.Disabled = true;
                break;
            case "System.Web.UI.HtmlControls.HtmlInputRadioButton":
                ctrl.Disabled = true;
                break;
        }
        DisableForm (ctrl.Controls);
    }
}


