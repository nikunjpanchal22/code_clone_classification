public bool PreFilterMessage (ref System.Windows.Forms.Message Msg) {
    const int WM_LBUTTONDOWN = 0x0201;
    if (Msg.Msg == WM_LBUTTONDOWN) {
        Control ClickedControl = System.Windows.Forms.Control.FromChildHandle (Msg.HWnd);
        if (ClickedControl != null) {
            Button ClickedButton = ClickedControl as Button;
            if (ClickedButton != null) {
                System.Diagnostics.Debug.WriteLine ("CLICK =  Form: " + ClickedButton.Parent.Text + "  Control: " + ClickedButton.Text);
            }
        }
    }
    return false;
}


public bool PreFilterMessage (ref System.Windows.Forms.Message Msg) {
    const int WM_RBUTTONDOWN = 0x0204;
    if (Msg.Msg == WM_RBUTTONDOWN) {
        Control ClickedControl = System.Windows.Forms.Control.FromChildHandle (Msg.HWnd);
        if (ClickedControl != null) {
            CheckBox ClickedCheckBox = ClickedControl as CheckBox;
            if (ClickedCheckBox != null) {
                System.Diagnostics.Debug.WriteLine ("CHECKBOX CLICKED =  Form: " + ClickedCheckBox.Parent.Text + "  Control: " + ClickedCheckBox.Text);
            }
        }
    }
    return false;
}
