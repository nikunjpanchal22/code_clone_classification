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


 private static void PositionMidWindow(IntPtr hChildWnd) 
{ 
	Rectangle recChild = new Rectangle(0, 0, 0, 0); 
	bool success = GetWindowRect(hChildWnd, ref recChild); 
	int width = recChild.Width- recChild.X; 
	int height = recChild.Height - recChild.Y; 
	Rectangle recParent = new Rectangle(0, 0, 0, 0); 
	success = GetWindowRect(_owner.Handle, ref recParent); 
	Point ptCenter = new Point(recParent.Left + (recParent.Width - width) / 2, recParent.Top + (recParent.Height - height) / 2); 
	int result = MoveResizeWindow(hChildWnd, ptCenter.X, ptCenter.Y, width, height, false); 
}


