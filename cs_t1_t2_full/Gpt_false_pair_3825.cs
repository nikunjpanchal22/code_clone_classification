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
    const int WM_MOUSEMOVE = 0x0200;
    if (Msg.Msg == WM_MOUSEMOVE) {
        Control HoveredControl = System.Windows.Forms.Control.FromChildHandle (Msg.HWnd);
        if (HoveredControl != null) {
            RichTextBox HoveredRichTextBox = HoveredControl as RichTextBox;
            if (HoveredRichTextBox != null) {
                System.Diagnostics.Debug.WriteLine ("MOUSE HOVERED =  Form: " + HoveredRichTextBox.Parent.Text + "  Control: " + HoveredRichTextBox.Text);
            }
        }
    }
    return false;
}
