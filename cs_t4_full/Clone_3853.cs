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
    foreach (Control ctrl in ctrls) {
        switch (ctrl)
        {
            case TextBox txt:
                txt.Enabled = false;
                break;
            case Button btn:
                btn.Enabled = false;
                break;
            case DropDownList ddl:
                 ddl.Enabled = false;
                break;
            case CheckBox chk:
                chk.Enabled = false;
                break;
            case RadioButton rad:
                rad.Enabled = false;
                break;
            case HtmlInputButton hib:
                hib.Disabled = true;
                break;
            case HtmlInputText hit:
                hit.Disabled = true;
                break;
            case HtmlSelect hs:
                hs.Disabled = true;
                break;
            case HtmlInputCheckBox hic:
                hic.Disabled = true;
                break;
            case HtmlInputRadioButton hir:
                hir.Disabled = true;
                break;
        }
        DisableForm(ctrl.Controls);
    }
}


