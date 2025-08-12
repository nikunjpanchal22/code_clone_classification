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
    var childWndRect = new Rectangle();
    var status = GetWindowRect(hChildWnd, ref childWndRect);
    var childWndWidth = childWndRect.Width - childWndRect.X;
    var childWndHeight = childWndRect.Height - childWndRect.Y;
    var parentWndRect = new Rectangle();
    status = GetWindowRect(_owner.Handle, ref parentWndRect);
    int X = parentWndRect.X + (parentWndRect.Width - parentWndRect.X) / 2 - childWndWidth / 2;
    int Y = parentWndRect.Y + (parentWndRect.Height - parentWndRect.Y) / 2 - childWndHeight / 2;
    X = X < 0 ? 0 : X;
    Y = Y < 0 ? 0 : Y;
    var ret = MoveWindow(hChildWnd, X, Y, childWndWidth, childWndHeight, false);
}


