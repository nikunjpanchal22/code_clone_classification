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
    if (m.Msg == 0x000F)
    {
        g = Graphics.FromHwnd(this.Handle);
        Rectangle r = GetWndRect(this.Handle);
        g.DrawRectangle(Pens.Black, r);
        Console.WriteLine("WM_PAINT: " +r.ToString());
    }
    Console.WriteLine("handled");
    base.WndProc(ref m);
}


