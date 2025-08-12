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



public static ScrollViewer RetrieveScrollViewer(FlowDocumentScrollViewer fDScrollViewer)
	{
	    if (VisualTreeHelper.GetChildrenCount(fDScrollViewer) == 0) 
		return null;

	    DependencyObject firstElement = VisualTreeHelper.GetChild(fDScrollViewer, 0);
	    if (firstElement == null) 
		return null;

	    Decorator component = VisualTreeHelper.GetChild(firstElement, 0) as Decorator;
	    if (component == null) 
		return null;

	    return component.Child as ScrollViewer;
}


