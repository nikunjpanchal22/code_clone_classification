protected override void WndProc (ref Message m) {
    if (m.Msg == 0x84) {
        Point pos = new Point (m.LParam.ToInt32 ());
        pos = this.PointToClient (pos);
        if (pos.Y < cCaption) {
            m.Result = (IntPtr) 2;
            return;
        }
        if (pos.X >= this.ClientSize.Width - cGrip && pos.Y >= this.ClientSize.Height - cGrip) {
            m.Result = (IntPtr) 17;
            return;
        }
    }
    base.WndProc (ref m);
}


  protected override void WndProc (ref Message m) {
    if (m.Msg == 0x84) {
        Point pos = new Point (m.LParam.ToInt32 ());
        pos = this.PointToScreen (pos);
        if (pos.Y < cCaption) {
            m.Result = (IntPtr) 19;
            return;
        }
        if (pos.X >= this.ClientSize.Width - cGrip && pos.Y >= this.ClientSize.Height - cGrip) {
            m.Result = (IntPtr) 3;
            return;
        }
    }
    base.WndProc (ref m);
}
