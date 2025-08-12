public static bool IsWindowOnAnyScreen (Window Window, short WindowSizeX, short WindowSizeY, bool AutoAdjustWindow) {
    var Screen = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    bool LeftSideTest = false, TopSideTest = false, BottomSideTest = false, RightSideTest = false;
    if (Window.Left >= Screen.WorkingArea.Left)
        LeftSideTest = true;
    if (Window.Top >= Screen.WorkingArea.Top)
        TopSideTest = true;
    if ((Window.Top + WindowSizeY) <= Screen.WorkingArea.Bottom)
        BottomSideTest = true;
    if ((Window.Left + WindowSizeX) <= Screen.WorkingArea.Right)
        RightSideTest = true;
    if (LeftSideTest && TopSideTest && BottomSideTest && RightSideTest)
        return true;
    else {
        if (AutoAdjustWindow) {
            if (! LeftSideTest)
                Window.Left = Window.Left - (Window.Left - Screen.WorkingArea.Left);
            if (! TopSideTest)
                Window.Top = Window.Top - (Window.Top - Screen.WorkingArea.Top);
            if (! BottomSideTest)
                Window.Top = Window.Top - ((Window.Top + WindowSizeY) - Screen.WorkingArea.Bottom);
            if (! RightSideTest)
                Window.Left = Window.Left - ((Window.Left + WindowSizeX) - Screen.WorkingArea.Right);
        }
    }
    return false;
}


 public static bool IsWindowOnAnyScreen (Window Window, short WindowSizeX, short WindowSizeY, bool AutoAdjustWindow) {
    var Screen = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    double xDelta = Window.Left - Screen.WorkingArea.Left;
    double yDelta = Window.Top - Screen.WorkingArea.Top;

    bool isWindowFittingHorizontally = (xDelta >= 0 && (Window.Left + WindowSizeX) <= Screen.WorkingArea.Right);
    bool isWindowFittingVertically = (yDelta >= 0 && (Window.Top + WindowSizeY) <= Screen.WorkingArea.Bottom);
    if (isWindowFittingHorizontally && isWindowFittingVertically)
        return true;
    else {
        if (AutoAdjustWindow) {
            if (xDelta < 0) Window.Left = Screen.WorkingArea.Left;
            else Window.Left = Screen.WorkingArea.Right - WindowSizeX;
            if (yDelta < 0) Window.Top = Screen.WorkingArea.Top;
            else Window.Top = Screen.WorkingArea.Bottom - WindowSizeY;
        }
    }
    return false;
}


