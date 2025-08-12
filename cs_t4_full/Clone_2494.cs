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
    if (m.Msg == 15)
    {
        var g = Graphics.FromHwnd(Handle);
        var r = new Rectangle(GetWndRect(Handle));
        g.DrawRectangle(p, r);
        Console.Out.WriteLine($"WM_PAINT: {r}");
    }
    Console.Out.WriteLine("handled");
    base.WndProc(ref m);
}


