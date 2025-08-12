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
    base.WndProc(ref m);

    if (m.Msg != WM_CLIPBOARDUPDATE) {
        return;
    }

    IDataObject dataObject = Clipboard.GetDataObject();
    ClipboardContentType type = GetClipboardContentType(dataObject);

    switch (type) 
    {
        case ClipboardContentType.Text:
            string clipboardText = dataObject.GetData(DataFormats.Text) as string;
            ProcessClipboardText(clipboardText);
            break;
        case ClipboardContentType.Image:
            Bitmap clipboardImage = dataObject.GetData(DataFormats.Bitmap) as Bitmap;
            ProcessClipboardImage(clipboardImage);
            break;
    }
}


