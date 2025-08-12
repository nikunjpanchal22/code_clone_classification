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


public bool PreFilterMessage(ref System.Windows.Forms.Message Msg) {
    const int WM_LBUTTONDOWN = 0x0201;
    if (Msg.Msg == WM_LBUTTONDOWN) {
        Control ClickedControl = System.Windows.Forms.Control.FromChildHandle (Msg.HWnd);
        if (ClickedControl != null) {
            TextBox ClickedTextBox = ClickedControl as TextBox;
            if (ClickedTextBox != null) {
                System.Diagnostics.Debug.WriteLine("CLICK =  Form: " + ClickedTextBox.Parent.Text + "  Control: " + ClickedTextBox.Text);
            }
        }
    }
    return false;

}
