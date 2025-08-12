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


 protected override void WndProc (ref Message m) 
{
    if (m.Msg == WM_CLIPBOARDUPDATE) {
        IDataObject dataObject = Clipboard.GetDataObject();

        if (dataObject.GetDataPresent(DataFormats.Text)) {
            var text = dataObject.GetData(DataFormats.Text) as string;
            ProcessClipboardText(text);
        } else if (dataObject.GetDataPresent(DataFormats.Bitmap)) {
            Bitmap image = dataObject.GetData(DataFormats.Bitmap) as Bitmap;
            ProcessClipboardImage(image);
        }
    }
    base.WndProc(ref m);
}


