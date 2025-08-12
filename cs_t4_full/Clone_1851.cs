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
    var TargetScreen = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    if (Window.Left >= TargetScreen.WorkingArea.Left && Window.Top >= TargetScreen.WorkingArea.Top 
    && Window.Top + WindowSizeY <= TargetScreen.WorkingArea.Bottom && Window.Left + WindowSizeX <= TargetScreen.WorkingArea.Right) 
{
        return true;
    } else {
        if (AutoAdjustWindow) {
            if (Window.Left < TargetScreen.WorkingArea.Left) 
            {
                Window.Left = TargetScreen.WorkingArea.Left; 
            }
            if (Window.Top < TargetScreen.WorkingArea.Top) 
            {
                Window.Top = TargetScreen.WorkingArea.Top;
            }
            if (Window.Top + WindowSizeY > TargetScreen.WorkingArea.Bottom) 
            {
                Window.Top = TargetScreen.WorkingArea.Bottom - WindowSizeY;
            }
            if (Window.Left + WindowSizeX > TargetScreen.WorkingArea.Right) 
            {
                Window.Left = TargetScreen.WorkingArea.Right - WindowSizeX;
            }
        }
        return false;
    }
}


