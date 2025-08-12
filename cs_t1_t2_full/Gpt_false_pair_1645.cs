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
    IntPtr hWnd = FindWindow (null, title);
 
    if (hWnd != null) {
        ShowWindow(hWnd, SW_SHOWNORMAL);
        SetWindowLong(hWnd, GWL_EXSTYLE, GetWindowLong(hWnd, GWL_EXSTYLE) ^ WS_EX_TOPMOST);
        SetWindowPos (hWnd, HWND_NOTOPMOST, 0, 0, 0, 0, SWP_NOSIZE | SWP_NOMOVE | SWP_FRAMECHANGED | SWP_SHOWWINDOW);
        BringWindowToTop(hWnd);
        SetActiveWindow(hWnd);
        SetForegroundWindow(hWnd);

        Thread.Sleep (500);
        foreach (Process process in Process.GetProcessesByName ("IExplore")) {
            if (process.MainWindowTitle.ToLower ().Contains (title.ToLower ())) {
                hWnd = process.MainWindowHandle;
                break;
            }
        }
        EnumProc proc = new EnumProc (EnumWindows);
        EnumChildWindows (hWnd, proc, ref hWnd);
    }
    return hWnd;
}
