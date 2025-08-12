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

    if (Window.Left >= Screen.WorkingArea.Left && Window.Top >= Screen.WorkingArea.Top && Window.Left + WindowSizeX <= Screen.WorkingArea.Right && Window.Top + WindowSizeY <= Screen.WorkingArea.Bottom)
        return true;

     if (AutoAdjustWindow) {
         int differenceFromLeft = Window.Left - Screen.WorkingArea.Left;
         int differenceFromTop = Window.Top - Screen.WorkingArea.Top;
         int differenceFromRight = Window.Left + WindowSizeX - Screen.WorkingArea.Right;
         int differenceFromBottom = Window.Top + WindowSizeY - Screen.WorkingArea.Bottom;

         if (differenceFromLeft < 0) {
             Window.Left = Window.Left - differenceFromLeft;
         }
         if (differenceFromTop < 0) {
             Window.Top = Window.Top - differenceFromTop;
         }
         if (differenceFromRight > 0) {
             Window.Left = Window.Left - differenceFromRight;
         }
         if (differenceFromBottom > 0) {
             Window.Top = Window.Top - differenceFromBottom;
         }
     }

     return false;
 }


