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
                var g = Graphics.FromHwnd (this.Handle);
                var r = GetWndRect (this.Handle);
                System.Drawing.Drawing2D.GraphicsPath gp = new System.Drawing.Drawing2D.GraphicsPath();
                gp.AddRectangle(r);
                g.DrawPath(p, gp);
                Trace.WriteLine ("WM_PAINT: " + r.ToString ());
            } break;
    }
    Trace.WriteLine ("handled");
    base.WndProc (ref m);
}
