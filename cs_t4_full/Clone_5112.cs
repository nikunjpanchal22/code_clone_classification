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
    float leftSideTestDelta = Screen.WorkingArea.Left - Window.Left;
    float topSideTestDelta = Screen.WorkingArea.Top - Window.Top;
    float bottomSideTestDelta = Screen.WorkingArea.Bottom - (Window.Top + WindowSizeY);
    float rightSideTestDelta = Screen.WorkingArea.Right - (Window.Left + WindowSizeX);

    if (leftSideTestDelta <= 0 && topSideTestDelta <= 0 && bottomSideTestDelta >= 0 && rightSideTestDelta >= 0)
        return true;
    else {
        if (AutoAdjustWindow) {
            if (leftSideTestDelta > 0)
                Window.Left = Window.Left + leftSideTestDelta;
            if (topSideTestDelta > 0)
                Window.Top = Window.Top + topSideTestDelta;
            if (bottomSideTestDelta < 0)
                Window.Top = Window.Top - bottomSideTestDelta;
            if (rightSideTestDelta < 0)
                Window.Left = Window.Left - rightSideTestDelta;
        }
    }
    return false;
}


