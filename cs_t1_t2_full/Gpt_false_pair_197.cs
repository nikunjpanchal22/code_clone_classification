protected override void WndProc (ref Message m) {
    const UInt32 WM_NCHITTEST = 0x0084;
    const UInt32 WM_MOUSEMOVE = 0x0200;
    const UInt32 HTBOTTOMRIGHT = 17;
    const int RESIZE_HANDLE_SIZE = 10;
    bool handled = false;
    if (m.Msg == WM_NCHITTEST || m.Msg == WM_MOUSEMOVE) {
        Size formSize = this.Size;
        Point screenPoint = new Point (m.LParam.ToInt32 ());
        Point clientPoint = this.PointToClient (screenPoint);
        Rectangle hitBox = new Rectangle (formSize.Width - RESIZE_HANDLE_SIZE, formSize.Height - RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE);
        if (hitBox.Contains (clientPoint)) {
            m.Result = (IntPtr) HTBOTTOMRIGHT;
            handled = true;
        }
    }
    if (! handled)
        base.WndProc (ref m);
}


 protected override void WndProc (ref Message message) {
    const Int32 WM_NCHITTEST = 0x0084;
    const Int32 WM_MOUSEMOVE = 0x0200;
    const Int32 HTBOTTOMRIGHT = 17;
    const Int32 RESIZE_HANDLE_SIZE = 10;
    Boolean isHandled = false;
    //i
    if (message.Msg == WM_NCHITTEST || message.Msg == WM_MOUSEMOVE) {
        Size windowSize = this.Size;
        Point screenPoint = new Point (message.LParam.ToInt32 ());
        Point clientPoint = this.PointToClient (screenPoint);
        Rectangle hitBox = new Rectangle (windowSize.Width - RESIZE_HANDLE_SIZE, windowSize.Height - RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE);
        //ii
        if (hitBox.Contains (clientPoint)) {
            message.Result = (IntPtr) HTBOTTOMRIGHT;
            isHandled = true;
        }
    }
    //iii
    if (! isHandled)
        base.WndProc (ref message);
}
