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



public static ScrollViewer ScanScrollViewer(FlowDocumentScrollViewer viewerObj)
	{
	    if (VisualTreeHelper.GetChildrenCount(viewerObj) == 0) 
		return null;

	    DependencyObject frontChild = VisualTreeHelper.GetChild(viewerObj, 0);
	    if (frontChild == null) 
		return null;

	    Decorator borderItem = VisualTreeHelper.GetChild(frontChild, 0) as Decorator;
	    if (borderItem == null)
		return null;
	      
	    return borderItem.Child as ScrollViewer;
}


