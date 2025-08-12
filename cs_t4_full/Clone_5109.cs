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
    bool leftSideTest = false, topSideTest = false, bottomSideTest = false, rightSideTest = false;
    if (Window.Left >= Screen.WorkingArea.Left) leftSideTest = true;
    if (Window.Top >= Screen.WorkingArea.Top) topSideTest = true;
    if (Window.Top + WindowSizeY <= Screen.WorkingArea.Bottom) bottomSideTest = true;
    if (Window.Left + WindowSizeX <= Screen.WorkingArea.Right) rightSideTest = true;
    if (leftSideTest && topSideTest && bottomSideTest && rightSideTest)
        return true;
    else {
        if (AutoAdjustWindow) {
            int gapFromLeft = Math.Abs (Window.Left - Screen.WorkingArea.Left);
            int gapFromTop = Math.Abs (Window.Top - Screen.WorkingArea.Top);
            int gapFromBottom = Math.Abs (Window.Top + WindowSizeY - Screen.WorkingArea.Bottom);
            int gapFromRight = Math.Abs (Window.Left + WindowSizeX - Screen.WorkingArea.Right);

            if (gapFromLeft > 0) Window.Left = Window.Left - gapFromLeft;
            if (gapFromTop > 0) Window.Top = Window.Top - gapFromTop;
            if (gapFromBottom > 0) Window.Top = Window.Top + gapFromBottom;
            if (gapFromRight > 0) Window.Left = Window.Left + gapFromRight;
        }
    }

    return false;
}


