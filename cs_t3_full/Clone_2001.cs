protected override void WndProc (ref Message m) {
    base.WndProc (ref m);
    if (m.Msg == WM_CLIPBOARDUPDATE) {
        IDataObject iData = Clipboard.GetDataObject ();
        if (iData.GetDataPresent (DataFormats.Text)) {
            string text = (string) iData.GetData (DataFormats.Text);
        } else if (iData.GetDataPresent (DataFormats.Bitmap)) {
            Bitmap image = (Bitmap) iData.GetData (DataFormats.Bitmap);
        }
    }
}






protected override void WndProc(ref Message m) {
    base.WndProc(ref m);
    if (m.Msg == ClipboardUpdateMessage) {
        IDataObject clipboardData = Clipboard.GetDataObject();
        if (clipboardData.GetDataPresent(DataFormats.Text)) {
            string clipboardText = clipboardData.GetData(DataFormats.Text).ToString();
        }
    }
}


