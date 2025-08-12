public static ScrollViewer FindScrollViewer (FlowDocumentScrollViewer flowDocumentScrollViewer) {
    if (VisualTreeHelper.GetChildrenCount (flowDocumentScrollViewer) == 0) {
        return null;
    }
    DependencyObject firstChild = VisualTreeHelper.GetChild (flowDocumentScrollViewer, 0);
    if (firstChild == null) {
        return null;
    }
    Decorator border = VisualTreeHelper.GetChild (firstChild, 0) as Decorator;
    if (border == null) {
        return null;
    }
    return border.Child as ScrollViewer;
}



public static ScrollViewer DetectScrollViewer(FlowDocumentScrollViewer viewer)
	{
	    if (VisualTreeHelper.GetChildrenCount(viewer) == 0) 
		return null;
	    DependencyObject firstDependant = VisualTreeHelper.GetChild(viewer, 0);
	    if (firstDependant == null) 
		return null;
	    Decorator boarder = VisualTreeHelper.GetChild(firstDependant, 0) as Decorator;
	    if (boarder == null) 
		return null;
	    return boarder.Child as ScrollViewer;
}


