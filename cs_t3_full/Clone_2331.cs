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
    const int WM_LBUTTONDOWN = 0x0201;
    if (Msg.Msg == WM_LBUTTONDOWN) {
        Control ClickedControl = System.Windows.Forms.Control.FromChildHandle (Msg.HWnd);
        if (ClickedControl is Button button) {
            System.Diagnostics.Debug.WriteLine (string.Format ("CLICK =  Form: {0}  Control: {1}", button.Parent.Text, button.Text)); 
        }
    }
    return false;
}


