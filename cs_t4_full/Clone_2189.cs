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
    foreach(Control c in controls)
    {
        if (c is TextBox tb)
            tb.Text = string.Empty;
        else if (c is NumericUpDown nud)
            nud.Value = 3;
        
        if (c.Controls.Count > 0)
            ResetFields(c.Controls);
    }
}


