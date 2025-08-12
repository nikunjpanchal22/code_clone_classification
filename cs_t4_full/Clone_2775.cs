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
    Rectangle childRect = new Rectangle();
    Rectangle parentRect = new Rectangle();
    bool success = GetWindowRect(hChildWnd, ref childRect);
    if (!success)
        return;
    int width = childRect.Width - childRect.X;
    int height = childRect.Height - childRect.Y;
    success = GetWindowRect(_owner.Handle, ref parentRect);
    if (!success)
        return;
    Point startPoint = new Point(
        Math.Max(0, (parentRect.X + (parentRect.Width - parentRect.X) / 2) - width / 2), 
        Math.Max(0, (parentRect.Y + (parentRect.Height - parentRect.Y) / 2) - height / 2));
    MoveWindow (hChildWnd, startPoint.X, startPoint.Y, width, height, false);
}


