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
    const int WM_PAINT = 0xf;
    if (m.Msg == WM_PAINT)
    {
        g = Graphics.FromHwnd(Handle);
        Rectangle r = GetWndRect(Handle); 
        g.DrawRectangle(p, r);
        Debug.WriteLine($"WM_PAINT: {r.ToString()}");
    }
    Debug.WriteLine("handled");
    base.WndProc(ref m);
}


