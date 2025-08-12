public static bool HitTest (Rectangle ctrlRect, IntPtr ctrlHandle, Point p, IntPtr ExcludeWindow) {
    enumedwindowPtrs.Clear ();
    enumedwindowRects.Clear ();
    callBackPtr = new CallBackPtr (EnumCallBack);
    EnumDesktopWindows (IntPtr.Zero, callBackPtr, 0);
    Region r = new Region (ctrlRect);
    bool StartClipping = false;
    for (int i = enumedwindowRects.Count - 1; i >= 0; i --) {
        if (StartClipping && enumedwindowPtrs [i] != ExcludeWindow) {
            r.Exclude (enumedwindowRects [i]);
        }
        if (enumedwindowPtrs [i] == ctrlHandle)
            StartClipping = true;
    }
    return r.IsVisible (p);
}


public static bool HitTest (Rectangle ctrlRect, IntPtr ctrlHandle, Point p, IntPtr ExcludeWindow) {
    enumedwindowPtrs.Clear ();
    enumedwindowRects.Clear ();
    callBackPtr = new CallBackPtr (EnumCallBack);
    EnumDesktopWindows (IntPtr.Zero, callBackPtr, 0);
    Region r = new Region (ctrlRect);
    bool StartClipping = false;
    for (int i = enumedwindowRects.Count - 1; i >= 0; i --) {
        if (StartClipping) {
            if (enumedwindowPtrs [i] != ExcludeWindow) { 
                r.Exclude (enumedwindowRects [i]);
            }
        }
        if (enumedwindowPtrs [i] == ctrlHandle)
            StartClipping = true;
    }
    return r.IsVisible (p);
}
