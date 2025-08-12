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
    Parallel.ForEach(controls.OfType<Control>(), control =>
    {
        if (control is TextBox) 
            control.Text = string.Empty;
        if (control is NumericUpDown) 
            ((NumericUpDown)control).Value = 3;

        if(control.Controls.Count > 0)
        {
            ResetFields(control.Controls);
        }
    });
}


