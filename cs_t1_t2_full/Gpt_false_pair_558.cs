protected override void WndProc (ref Message m) {
    switch (m.Msg) {
        case 0xf :
            {
                g = Graphics.FromHwnd (this.Handle);
                Rectangle r = GetWndRect (this.Handle);
                g.DrawRectangle (p, r);
                Trace.WriteLine ("WM_PAINT: " + r.ToString ());
            } break;
    }
    Trace.WriteLine ("handled");
    base.WndProc (ref m);
}


 protected override void WndProc (ref Message m) {
    switch (m.Msg) {
        case 0xf :
            {
                Graphics g = Graphics.FromHwnd (this.Handle);
                Rectangle r = GetWndRect (this.Handle);
                SolidBrush sb = new SolidBrush(Color.Orange);
                g.FillRectangle(sb,r);
                Trace.WriteLine ("WM_PAINT: " + r.ToString ());
            } break;
    }
    Trace.WriteLine ("handled");
    base.WndProc (ref m);
}
