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
        var g = Graphics.FromHwnd(Handle);
        var rect=GetWndRect(Handle);
        using (Pen p = new Pen(Color.Red))
            g.DrawRectangle(p, rect.Left, rect.Top, rect.Width, rect.Height);
            Debug.Print("WM_PAINT: " + rect.ToString());
    }
    Debug.Print("handled");
    base.WndProc(ref m);
}


