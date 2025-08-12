public static IntPtr getHWnd (string title) {
    IntPtr hWnd = FindWindow (null, title);
    BringWindowToTop (hWnd);
    SetActiveWindow (hWnd);
    SetForegroundWindow (hWnd);
    Thread.Sleep (500);
    foreach (Process process in Process.GetProcessesByName ("IExplore")) {
        if (process.MainWindowTitle.ToLower ().Contains (title.ToLower ())) {
            hWnd = process.MainWindowHandle;
            break;
        }
    }
    EnumProc proc = new EnumProc (EnumWindows);
    EnumChildWindows (hWnd, proc, ref hWnd);
    return hWnd;
}


 public static IntPtr getHWnd (string title)
{
     IntPtr hWnd = IntPtr.Zero;
    foreach (Process process in Process.GetProcessesByName("IExplore"))
    {
        if (process.MainWindowTitle.ToLower().Contains(title.ToLower()))
        {
            hWnd = process.MainWindowHandle;
            break;
        }
    }
    BringWindowToTop(hWnd);
    SetActiveWindow(hWnd);
    SetForegroundWindow(hWnd);
    Thread.Sleep(500);
    EnumProc proc = new EnumProc(EnumWindows);
    EnumChildWindows(hWnd, proc, ref hWnd);
    return hWnd;
}


