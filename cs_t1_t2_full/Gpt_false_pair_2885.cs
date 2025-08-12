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


public static bool IsWindowOnAnyScreen(Window Window, short WindowSizeX, short WindowSizeY, bool AutoAdjustWindow)
{
    var Screen = System.Windows.Forms.Screen.FromHandle(new WindowInteropHelper(Window).Handle);
    bool leftSideTest = false, topSideTest = false, bottomSideTest = false, rightSideTest = false;

    if (Window.Left >= Screen.WorkingArea.Left)
        leftSideTest = true;
    if (Window.Top >= Screen.WorkingArea.Top)
        topSideTest = true;
    if ((Window.Top + WindowSizeY) <= Screen.WorkingArea.Bottom)
        bottomSideTest = true;
    if ((Window.Left + WindowSizeX) <= Screen.WorkingArea.Right)
        rightSideTest = true;
    if (leftSideTest && topSideTest && bottomSideTest && rightSideTest)
        return true;

    if (AutoAdjustWindow)
    {
        if (!leftSideTest)
            Window.Left = Window.Left - (Window.Left - Screen.WorkingArea.Left);
        if (!topSideTest)
            Window.Top = Window.Top - (Window.Top - Screen.WorkingArea.Top);
        if (!bottomSideTest)
            Window.Top = Window.Top - ((Window.Top + WindowSizeY) - Screen.WorkingArea.Bottom);
        if (!rightSideTest)
            Window.Left = Window.Left - ((Window.Left + WindowSizeX) - Screen.WorkingArea.Right);
    }

    return false;
}
