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
    var ScreenFrame = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    int HighestScreenBorder = ScreenFrame.WorkingArea.Bottom, RightmostScreenBorder = ScreenFrame.WorkingArea.Right;
    if ((Window.Left >= ScreenFrame.WorkingArea.Left) && 
        (Window.Top >= ScreenFrame.WorkingArea.Top) && 
        (Window.Top + WindowSizeY) <= HighestScreenBorder && 
        (Window.Left + WindowSizeX) <= RightmostScreenBorder) 
{
        return true;
    } else {
        if (AutoAdjustWindow) {
            if (Window.Left < ScreenFrame.WorkingArea.Left) 
            {
                Window.Left = ScreenFrame.WorkingArea.Left; 
            }
            if (Window.Top < ScreenFrame.WorkingArea.Top) 
            {
                Window.Top = ScreenFrame.WorkingArea.Top;
            }
            if (Window.Top + WindowSizeY > HighestScreenBorder) 
            {
                Window.Top = HighestScreenBorder - WindowSizeY;
            }
            if (Window.Left + WindowSizeX > RightmostScreenBorder) 
            {
                Window.Left = RightmostScreenBorder - WindowSizeX;
            }
        }
        return false;
    }
}


