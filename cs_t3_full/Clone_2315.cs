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
		if (ctrl.GetType() == typeof(TextBox))
		    ((TextBox)ctrl).Enabled = false;
		else if (ctrl.GetType() == typeof(Button))
		    ((Button)ctrl).Enabled = false;
		else if (ctrl.GetType() == typeof(DropDownList))
		     ((DropDownList)ctrl).Enabled = false;
		else if (ctrl.GetType() == typeof(CheckBox))
		    ((CheckBox)ctrl).Enabled = false;
		else if (ctrl.GetType() == typeof(RadioButton))
		    ((RadioButton)ctrl).Enabled = false;
		else if (ctrl.GetType() == typeof(HtmlInputButton))
		    ((HtmlInputButton)ctrl).Disabled = true;
		else if (ctrl.GetType() == typeof(HtmlInputText))
		    ((HtmlInputText)ctrl).Disabled = true;
		else if (ctrl.GetType() == typeof(HtmlSelect))
		    ((HtmlSelect)ctrl).Disabled = true;
		else if (ctrl.GetType() == typeof(HtmlInputCheckBox))
		    ((HtmlInputCheckBox)ctrl).Disabled = true;
		else if (ctrl.GetType() == typeof(HtmlInputRadioButton))
		    ((HtmlInputRadioButton)ctrl).Disabled = true;
		DisableForm(ctrl.Controls);
	    }
}


