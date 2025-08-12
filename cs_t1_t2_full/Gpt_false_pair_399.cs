private void SendToPrinter () {
    ProcessStartInfo info = new ProcessStartInfo ();
    info.Verb = "print";
    info.FileName = @"c:\output.pdf";
    info.CreateNoWindow = true;
    info.WindowStyle = ProcessWindowStyle.Hidden;
    Process p = new Process ();
    p.StartInfo = info;
    p.Start ();
    long ticks = - 1;
    while (ticks != p.TotalProcessorTime.Ticks) {
        ticks = p.TotalProcessorTime.Ticks;
        Thread.Sleep (1000);
    }
    if (false == p.CloseMainWindow ())
        p.Kill ();
}


 private void SendToPrinter () {
    ProcessStartInfo info = new ProcessStartInfo();
    info.FileName = "C:\\Program Files\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe";
    info.Arguments = @"/h /t ""c:\output.pdf"" ";
    info.CreateNoWindow = true;
    info.WindowStyle = ProcessWindowStyle.Hidden;
    Process p = new Process();
    p.StartInfo = info;
    p.Start();
    long ticks = -1;
    while (ticks != p.TotalProcessorTime.Ticks)
    {
        ticks = p.TotalProcessorTime.Ticks;
        Thread.Sleep(1000);
    }
    if (false == p.CloseMainWindow())
        p.Kill();
}
