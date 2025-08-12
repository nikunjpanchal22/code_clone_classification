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


protected override void WndProc (ref Message m) {
    base.WndProc (ref m);
    if (m.Msg == WM_CLIPBOARDUPDATE) {
        IDataObject oData = Clipboard.GetDataObject();
        if (oData.GetDataPresent(DataFormats.Text)) {
            string words = (string)oData.GetData(DataFormats.Text);
        } else if (oData.GetDataPresent(DataFormats.Bitmap)) {
            Image pic = (Image)oData.GetData(DataFormats.Bitmap);
        }
    }
}
