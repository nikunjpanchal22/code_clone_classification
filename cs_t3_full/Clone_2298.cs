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



public static ScrollViewer FetchScrollViewer(FlowDocumentScrollViewer viewer)
	{
	    if (VisualTreeHelper.GetChildrenCount(viewer) == 0) 
		return null;
	    DependencyObject firstOne = VisualTreeHelper.GetChild(viewer, 0);
	    if (firstOne == null)
		return null; 

	    Decorator part = VisualTreeHelper.GetChild(firstOne, 0) as Decorator;
	    if (part == null) 
		return null;

	    return part.Child as ScrollViewer;
}


