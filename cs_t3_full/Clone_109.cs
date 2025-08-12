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


  public void ResetFields (Control.ControlCollection Controls) {
    foreach (Control control in Controls) {
        if (control is TextBox) {
            control.Text = "N/A";
        } else if (control is NumericUpDown) {
            ((NumericUpDown) control).Value = 0;
        } else if (control.Controls.Count > 0) {
            this.ResetFields (control.Controls);
        } else if (control is CheckBox) {
            ((CheckBox) control).Checked = true;
        }
    }
}


