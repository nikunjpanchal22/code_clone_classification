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
    var ThisScreen = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    if ((Window.Left >= ThisScreen.WorkingArea.Left) && 
        (Window.Top >= ThisScreen.WorkingArea.Top) && 
        ((Window.Top + WindowSizeY) <= ThisScreen.WorkingArea.Bottom) && 
        ((Window.Left + WindowSizeX) <= ThisScreen.WorkingArea.Right)) 
{
        return true;
    } else {
        if (AutoAdjustWindow) {
            if (Window.Left < ThisScreen.WorkingArea.Left) 
            {
                Window.Left = ThisScreen.WorkingArea.Left; 
            }
            if (Window.Top < ThisScreen.WorkingArea.Top) 
            {
                Window.Top = ThisScreen.WorkingArea.Top;
            }
            if (Window.Top + WindowSizeY > ThisScreen.WorkingArea.Bottom) 
            {
                Window.Top = ThisScreen.WorkingArea.Bottom - WindowSizeY;
            }
            if (Window.Left + WindowSizeX > ThisScreen.WorkingArea.Right) 
            {
                Window.Left = ThisScreen.WorkingArea.Right - WindowSizeX;
            }
        }
        return false;
    }
}


