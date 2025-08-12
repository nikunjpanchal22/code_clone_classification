static void Main (string [] args) {
    Console.WriteLine ("Start notepad and hit any key...");
    Console.ReadKey (true);
    Process [] processes = Process.GetProcessesByName ("notepad");
    foreach (Process p in processes) {
        var handle = p.MainWindowHandle;
        SetWindowPos (handle, new IntPtr (SpecialWindowHandles.HWND_TOP), 10, 10, 450, 450, SetWindowPosFlags.SWP_SHOWWINDOW);
        break;
    }
}


static void Main (string [] args) {
    Console.WriteLine ("Start notepad and hit any key...");
    Console.ReadKey (true);
    Process [] processes = Process.GetProcessesByName ("notepad");
    foreach (Process p in processes) {
        var handle = p.MainWindowHandle;
        SetWindowPos (handle, new IntPtr (SpecialWindowHandles.HWND_TOP), 30, 30, 550, 550, SetWindowPosFlags.SWP_SHOWWINDOW);
        break;
    }
}
