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
    GetWindowRect(hChildWnd, out var childRect);
    int width = childRect.Width;
    int height = childRect.Height;
    GetWindowRect(_owner.Handle, out var parentRect);
    int midX = parentRect.Width / 2;
    int midY = parentRect.Height / 2;
    int startX = Math.Max(0, midX - width / 2);
    int startY = Math.Max(0, midY - height / 2);
    MoveWindow(hChildWnd, startX, startY, width, height, false);
}


