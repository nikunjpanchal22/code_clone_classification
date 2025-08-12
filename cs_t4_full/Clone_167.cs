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
    base.WndProc (ref m);
    if (m.Msg == WM_CLIPBOARDUPDATE) {
        IDataObject iData = Clipboard.GetDataObject ();
        ClipboardContentType clipboardContentType = GetClipboardContentType(iData);

        switch (clipboardContentType)
        {
            case ClipboardContentType.Text:
                string text = (string) iData.GetData (DataFormats.Text);
                ProcessClipboardText(text);
                break;

            case ClipboardContentType.Image:
                Bitmap image = (Bitmap) iData.GetData (DataFormats.Bitmap);
                ProcessClipboardImage(image);
                break;
        }
    }
}


