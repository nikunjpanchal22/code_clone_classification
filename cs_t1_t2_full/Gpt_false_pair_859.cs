public bool PreFilterMessage (ref Message m) {
    if (m.Msg == 0x20a) {
        Point pos = new Point (m.LParam.ToInt32 () & 0xffff, m.LParam.ToInt32 () > > 16);
        IntPtr hWnd = WindowFromPoint (pos);
        if (hWnd != IntPtr.Zero && hWnd != m.HWnd && Control.FromHandle (hWnd) != null) {
            SendMessage (hWnd, m.Msg, m.WParam, m.LParam);
            return true;
        }
    }
    return false;
}


  public bool PreFilterMessage (ref Message m) {
    if (m.Msg == 0x20a) {
        Point pos = new Point (m.LParam.ToInt32 () & 0xffff, m.LParam.ToInt32 () > > 16);
        IntPtr hWnd = WindowFromPoint (pos);
        if (hWnd != IntPtr.Zero && hWnd != m.HWnd && Control.FromHandle (hWnd) != null) {
            SetWindowsHookEx (m.Msg, m.WParam, m.LParam);
            return true;
        }
    }
    return false;
}
