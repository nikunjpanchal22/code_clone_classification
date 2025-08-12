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



public static ScrollViewer ExtractScrollViewer(FlowDocumentScrollViewer documentViewer)
	{
	    if (VisualTreeHelper.GetChildrenCount(documentViewer) == 0) 
		return null;
	    DependencyObject childDependency = VisualTreeHelper.GetChild(documentViewer, 0);
	    if (childDependency == null) 
		return null;
	    Decorator firstDecorator = VisualTreeHelper.GetChild(childDependency, 0) as Decorator;
	    if (firstDecorator == null) 
		return null;
	    return firstDecorator.Child as ScrollViewer;
}


