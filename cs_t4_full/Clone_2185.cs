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
    controls.OfType<Control>()
                .ToList()
                .ForEach(c =>
                {
                    if (c is TextBox) 
                        c.Text = string.Empty;
                    if (c is NumericUpDown) 
                        ((NumericUpDown) c).Value = 3;
                    if (c.Controls.Count > 0)
                        ResetFields(c.Controls);
                });
}


