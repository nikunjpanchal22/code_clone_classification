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



protected override void WndProc(ref Message m)
{
    bool Handled = false;
    if(m.Msg == 0x0084 || m.Msg == 0x0200) //WM_NCHITTEST & WM_MOUSEMOVE
    {
        int x = m.LParam.ToInt32() & 0xffff;
        int y = m.LParam.ToInt32() >> 16;
        Point pt = PointToClient(new Point(x, y));
        Rectangle gripRect = new Rectangle(ClientSize.Width - 10, ClientSize.Height - 10, 10, 10);
        if(gripRect.Contains(pt)){
            m.Result = (IntPtr)17; //HTBOTTOMRIGHT
            Handled = true;
        }
    }

    if(!Handled) { base.WndProc(ref m); }
}


