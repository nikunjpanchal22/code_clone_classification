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

    //Bringing our window back to focus
    BringWindowToTop (hWnd);
    SetActiveWindow (hWnd);
    ShowWindowAsync(hWnd, (int)WindowShowStyle.ShowNormal);
    SetWindowPos (hWnd, 0, 0, 0, 0, 0, (int)SetWindowPosFlags.NoSize | (int)SetWindowPosFlags.NoMove); 
    Thread.Sleep (500);
    foreach (Process process in Process.GetProcessesByName ("IExplore")) 
    {
        if (process.MainWindowTitle.ToLower ().Contains (title.ToLower ())) 
        {
            hWnd = process.MainWindowHandle;
            break;
        }
    }
    EnumProc proc = new EnumProc (EnumWindows);
    EnumChildWindows (hWnd, proc, ref hWnd);
    return hWnd;
}
