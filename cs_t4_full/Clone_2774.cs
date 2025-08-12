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
    if (GetWindowRect(hChildWnd, out Rectangle childRect))
    {
        if (GetWindowRect(_owner.Handle, out Rectangle parentRect))
        {
            int childWidth = childRect.Width;
            int childHeight = childRect.Height;
            int parentX = parentRect.X;
            int parentY = parentRect.Y;
            int parentWidth = parentRect.Width;
            int parentHeight = parentRect.Height;
            int centerX = parentX + ((parentWidth - parentX) / 2);
            int centerY = parentY + ((parentHeight - parentY) / 2);
            int x = Math.Max(0, (centerX - (childWidth / 2)));
            int y = Math.Max(0, (centerY - (childHeight / 2)));
            MoveWindow (hChildWnd, x, y, childWidth, childHeight, false);
        }
    }
}


