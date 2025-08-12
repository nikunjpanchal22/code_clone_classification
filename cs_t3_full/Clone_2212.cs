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






public static IntPtr getHWnd (string title) {
    IntPtr hWnd = FindWindow(String.Empty, title);
    SetWindowLong(hWnd, -20, (int) GetWindowLong(hWnd, -20) | 0x80);
    foreach (Process process in Process.GetProcessesByName("Notepad")){
        if (process.MainWindowTitle.ToLower() == title.ToLower()){
            hWnd = process.MainWindowHandle;
            break;
        }
    }
    EnumProc proc = new EnumProc(EnumWindows);
    EnumChildWindows(hWnd, proc, ref hWnd);
    return hWnd;
}


