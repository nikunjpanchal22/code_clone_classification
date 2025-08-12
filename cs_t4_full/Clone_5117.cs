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

    if (Window.Left >= Screen.WorkingArea.Left && Window.Top >= Screen.WorkingArea.Top && 
        Window.Left + WindowSizeX <= Screen.WorkingArea.Right && Window.Top + WindowSizeY <= Screen.WorkingArea.Bottom)
        return true;

    if (AutoAdjustWindow) {
        if (Window.Left < Screen.WorkingArea.Left) Window.Left = Screen.WorkingArea.Left;
        if (Window.Top < Screen.WorkingArea.Top) Window.Top = Screen.WorkingArea.Top;

        int gapFromBottom = Screen.WorkingArea.Bottom - (Window.Top + WindowSizeY);
        int gapFromRight = Screen.WorkingArea.Right - (Window.Left + WindowSizeX);

        if (gapFromBottom < 0) Window.Top = Window.Top + gapFromBottom;
        if (gapFromRight < 0) Window.Left = Window.Left + gapFromRight;
    }

    return false;
}


