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


 protected override void WndProc (ref Message msg) {
    const UInt16 WM_NCHITTEST = 0x0084;
    const UInt16 WM_MOUSEMOVE = 0x0200;
    const Int32 HTBOTTOMRIGHT = 17;
    const int RESIZE_HANDLE_SIZE = 10;
    //i
    bool handled = false;
    if (msg.Msg == WM_NCHITTEST || msg.Msg == WM_MOUSEMOVE) {
        Size formSize = this.Size;
        Point currScreenPoint = new Point (msg.LParam.ToInt32 ());
        Point currClientPoint = this.PointToClient (currScreenPoint);
        Rectangle hitBox = new Rectangle (formSize.Width - RESIZE_HANDLE_SIZE, formSize.Height - RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE);
        //ii
        if (hitBox.Contains (currClientPoint)) {
            msg.Result = (IntPtr)HTBOTTOMRIGHT;
            handled = true;
        }
    }
    //iii
    if (! handled)
        base.WndProc (ref msg);
}
