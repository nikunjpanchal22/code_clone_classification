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
    bool isWindowOnScreenX = false, isWindowOnScreenY = false;

    if (Window.Left >= Screen.WorkingArea.Left && Window.Left  + WindowSizeX <= Screen.WorkingArea.Right) isWindowOnScreenX = true;
    if (Window.Top >= Screen.WorkingArea.Top && Window.Top + WindowSizeY <= Screen.WorkingArea.Bottom) isWindowOnScreenY = true;
    if (isWindowOnScreenX && isWindowOnScreenY) return true;

    if (AutoAdjustWindow) {
        if (! isWindowOnScreenX) {
            if (Window.Left < Screen.WorkingArea.Left) Window.Left = Screen.WorkingArea.Left;
            else  Window.Left = Screen.WorkingArea.Right - WindowSizeX;
        }

        if (! isWindowOnScreenY) {
            if (Window.Top < Screen.WorkingArea.Top) Window.Top = Screen.WorkingArea.Top;
            else  Window.Top = Screen.WorkingArea.Bottom - WindowSizeY;
        }
    }
    return false;
}


