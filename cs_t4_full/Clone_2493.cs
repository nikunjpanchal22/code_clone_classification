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



protected override void WndProc(ref Message m)
{
    if (m.Msg == 0xf)
    {
        g = Graphics.FromHwnd(base.Handle);
        Rectangle r = new Rectangle(0, 0, base.Width, base.Height);
        g.DrawRectangle(p, r);
        Debug.WriteLine($"WM_PAINT: {r}");
    }
    Debug.WriteLine("handled");
    base.WndProc(ref m);
}


