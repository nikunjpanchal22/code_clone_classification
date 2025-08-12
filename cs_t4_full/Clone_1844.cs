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
    var ProvidedScreen = System.Windows.Forms.Screen.FromHandle (new WindowInteropHelper (Window).Handle);
    bool InsideXArea = false, InsideYArea = false;
    if (Window.Left >= ProvidedScreen.WorkingArea.Left && (Window.Left + WindowSizeX) <= ProvidedScreen.WorkingArea.Right)
        InsideXArea = true;
    if (Window.Top >= ProvidedScreen.WorkingArea.Top && (Window.Top + WindowSizeY) <= ProvidedScreen.WorkingArea.Bottom)
        InsideYArea = true;
        
    if (InsideXArea && InsideYArea)
        return true;
    else {
        if (AutoAdjustWindow) {
            if (! InsideXArea)
                Window.Left = ProvidedScreen.WorkingArea.Left;
            if (! InsideYArea)
                Window.Top = ProvidedScreen.WorkingArea.Top;
        }
    }
    return false;
}


