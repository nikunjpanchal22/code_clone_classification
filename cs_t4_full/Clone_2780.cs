private static void CenterWindow (IntPtr hChildWnd) {
    Rectangle recChild = new Rectangle (0, 0, 0, 0);
    bool success = GetWindowRect (hChildWnd, ref recChild);
    int width = recChild.Width - recChild.X;
    int height = recChild.Height - recChild.Y;
    Rectangle recParent = new Rectangle (0, 0, 0, 0);
    success = GetWindowRect (_owner.Handle, ref recParent);
    Point ptCenter = new Point (0, 0);
    ptCenter.X = recParent.X + ((recParent.Width - recParent.X) / 2);
    ptCenter.Y = recParent.Y + ((recParent.Height - recParent.Y) / 2);
    Point ptStart = new Point (0, 0);
    ptStart.X = (ptCenter.X - (width / 2));
    ptStart.Y = (ptCenter.Y - (height / 2));
    ptStart.X = (ptStart.X < 0) ? 0 : ptStart.X;
    ptStart.Y = (ptStart.Y < 0) ? 0 : ptStart.Y;
    int result = MoveWindow (hChildWnd, ptStart.X, ptStart.Y, width, height, false);
}



 

private static void CenterWindow(IntPtr hChildWnd)
{
    Rectangle childRect = Rectangle.Empty;
    Rectangle parentRect = Rectangle.Empty;
    bool success = GetWindowRect(hChildWnd, ref childRect) && GetWindowRect(_owner.Handle, ref parentRect);
    if (!success) return;
    int x = Math.Max(0, parentRect.X + ((parentRect.Width - parentRect.X) / 2) - ((childRect.Width - childRect.X) / 2));
    int y = Math.Max(0, parentRect.Y + ((parentRect.Height - parentRect.Y) / 2) - ((childRect.Height - childRect.Y) / 2));
    MoveWindow (hChildWnd, x, y, childRect.Width - childRect.X, childRect.Height - childRect.Y, false);
}


