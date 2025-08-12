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



protected override void WndProc (ref Message m) 
{
    const int HitTestBottomRight = 17;
    if (m.Msg == 0x0084)
    {
        Point pos = new Point(m.LParam.ToInt32() & 0xffff, m.LParam.ToInt32() >> 16);
        if (pos.X >= this.ClientSize.Width - 10 && pos.Y >= this.ClientSize.Height - 10)
        {
            m.Result = new IntPtr(HitTestBottomRight);
            return;
        }
    }
    base.WndProc(ref m);
}


