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
        if (m.Msg == 0x0084) // WM_NCHITTEST
        {
            if (this.WindowState == FormWindowState.Normal)
            {
                Point screenPoint = new Point(m.LParam.ToInt32());
                Point clientPoint = this.PointToClient(screenPoint);

                CornerArea cornerArea = CornerArea.None;

                if (new Rectangle(this.ClientSize.Width - RESIZE_HANDLE_SIZE, this.ClientSize.Height - RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE, RESIZE_HANDLE_SIZE).Contains(clientPoint)) cornerArea = CornerArea.BottomRight;

                if (cornerArea != CornerArea.None)
                {
                    m.Result = (IntPtr)(int)cornerArea;
                    return;
                }
            }
        }

        base.WndProc(ref m);
}


