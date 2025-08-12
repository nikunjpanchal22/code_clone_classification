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



public static ScrollViewer FindScroller(FlowDocumentScrollViewer docViewer)
{
	    if (VisualTreeHelper.GetChildrenCount(docViewer) == 0) 
		return null;

	    DependencyObject firstInLine = VisualTreeHelper.GetChild(docViewer, 0);
	    if (firstInLine == null) 
		return null;

	    Decorator item = VisualTreeHelper.GetChild(firstInLine, 0) as Decorator;
	    if (item == null) 
		return null;

	    return item.Child as ScrollViewer;
}


