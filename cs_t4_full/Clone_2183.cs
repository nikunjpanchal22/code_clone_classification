public void ResetFields (Control.ControlCollection Controls) {
    foreach (Control control in Controls) {
        if (control is TextBox) {
            control.Text = string.Empty;
        } else if (control is NumericUpDown) {
            ((NumericUpDown) control).Value = 3;
        } else if (control.Controls.Count > 0) {
            this.ResetFields (control.Controls);
        }
    }
}


public void ResetFields(Control.ControlCollection controls)
{
    foreach (Control c in controls)
    {
        switch (c)
        {
            case TextBox textbox:
                textbox.Text = string.Empty;
                break;
            case NumericUpDown numericUpdown:
                numericUpdown.Value = 3;
                break;
        }

        if (c.HasChildren)
        {
            ResetFields(c.Controls);
        }
    }
}


