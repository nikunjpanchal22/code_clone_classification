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



public static ScrollViewer CaptureScrollViewer(FlowDocumentScrollViewer docView)
	{
	    if (VisualTreeHelper.GetChildrenCount(docView) == 0) 
		return null;

	    DependencyObject headChild = VisualTreeHelper.GetChild(docView, 0);
	    if (headChild == null) 
		return null;

	    Decorator decor = VisualTreeHelper.GetChild(headChild, 0) as Decorator;
	    if (decor == null) 
		return null;

	    return decor.Child as ScrollViewer;
}


