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
        Rectangle r = Rectangle.FromLTRB(0,0, this.Width, this.Height);
        g.DrawRectangle(p, r);
        Trace.WriteLine($"WM_PAINT: {r.ToString()}");
    }
    Trace.WriteLine("handled");
    base.WndProc(ref m);
}


