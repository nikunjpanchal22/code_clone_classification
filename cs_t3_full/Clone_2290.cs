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



public static ScrollViewer LookForScrollViewer(FlowDocumentScrollViewer myDocumentViewer)
{
	    if (VisualTreeHelper.GetChildrenCount(myDocumentViewer) == 0) 
		return null;

	    DependencyObject topChild = VisualTreeHelper.GetChild(myDocumentViewer, 0);
	    if (topChild == null) 
		return null;

	    Decorator decorElement = VisualTreeHelper.GetChild(topChild, 0) as Decorator;
	    if (decorElement == null) 
		return null;

	    return decorElement.Child as ScrollViewer;
}


