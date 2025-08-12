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



public static ScrollViewer ObtainScrollViewer(FlowDocumentScrollViewer scrollViewer)
	{
	    if (VisualTreeHelper.GetChildrenCount(scrollViewer) == 0) 
		return null;
	    DependencyObject initialChild = VisualTreeHelper.GetChild(scrollViewer, 0);
	    if (initialChild == null) 
		return null;
	    Decorator decoratorItem = VisualTreeHelper.GetChild(initialChild, 0) as Decorator;
	    if (decoratorItem == null) 
		return null;
	    return decoratorItem.Child as ScrollViewer;
}


