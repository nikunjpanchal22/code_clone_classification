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


	private static void MoveToMiddle(IntPtr hChildWnd) 
{ 
	Rectangle recChild = new Rectangle(0, 0, 0, 0); 
	bool success = GetWindowRect(hChildWnd, ref recChild); 
	int width = recChild.Width - recChild.X; 
	int height = recChild.Height - recChild.Y; 
	Size sizeChild = new Size(width, height); 
	Rectangle recOwner = new Rectangle(0, 0, 0, 0); 
	success = GetWindowRect(_owner.Handle, ref recOwner); 
	Point ptCenter = new Point(0, 0); 
	ptCenter.X = recOwner.X + ((recOwner.Width - recOwner.X) / 2); 
	ptCenter.Y = recOwner.Y + ((recOwner.Height - recOwner.Y) / 2);
	Point ptStart = new Point(0, 0); 
	ptStart.X = ptCenter.X - (width/2); 
	ptStart.Y = ptCenter.Y - (height/2); 
    ptStart.X = (ptStart.X < 0) ? 0 : ptStart.X; 
    ptStart.Y = (ptStart.Y < 0) ? 0 : ptStart.Y; 
    int result = MoveWindow(hChildWnd, ptStart.X, ptStart.Y, sizeChild.Width, sizeChild.Height, false); 
}
