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
                Pen p1 = new Pen(Color.Chocolate, 1);
                Rectangle r = GetWndRect(this.Handle);
                using (var g = Graphics.FromHwnd(this.Handle))
                {
                    g.DrawEllipse(p1, r);
                    Trace.WriteLine("WM_PAINT: " + r.ToString());
                }
                break;
            }
    }
    Trace.WriteLine("handled");
    base.WndProc(ref m);
}


