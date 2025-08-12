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
    System.Diagnostics.ProcessStartInfo PROCESS = new System.Diagnostics.ProcessStartInfo();
    PROCESS.Verb = "print";
    PROCESS.FileName = @"c:\output.pdf";
    PROCESS.CreateNoWindow = true;
    PROCESS.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
    System.Diagnostics.Process PRINTER = new System.Diagnostics.Process();
    PRINTER.StartInfo = PROCESS;
    PRINTER.Start();
    while(PRINTER.TotalProcessorTime.Ticks != 0){
        System.Threading.Thread.Sleep(1000);
    }
    if(!(PRINTER.CloseMainWindow())){
        PRINTER.Kill();
    }
}


