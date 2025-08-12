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
        g = Graphics.FromHwnd(this.Handle);
        Rectangle r = GetWndRect(this.Handle); 
        g.DrawRectangle(new Pen(Color.Black), r);
        Trace.TraceInformation("WM_PAINT: {0}", r);
    }
    Trace.TraceInformation("handled");
    base.WndProc(ref m);
}


