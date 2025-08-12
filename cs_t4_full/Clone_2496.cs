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
        g = Graphics.FromHwnd(Handle);
        Rectangle r = GetWndRect(Handle); 
        g.DrawRectangle(p, r);
        Console.WriteLine($"WM_PAINT: {r}");
    }
    Console.WriteLine("handled");
    base.WndProc(ref m);
}


