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


 

private void SendToPrinter() {
    var processInfo = new ProcessStartInfo {
        Verb = "print",
        FileName = @"c:\output.pdf",
        CreateNoWindow = true,
        WindowStyle = ProcessWindowStyle.Hidden
    };
    using(var process = new Process { StartInfo = processInfo }) {
        process.Start();
        while(process.TotalProcessorTime.Ticks - 1 != 0) {
            Thread.Sleep(1000);
        }
        if(process.CloseMainWindow() == false) {
            process.Kill();
        }
    }
}


