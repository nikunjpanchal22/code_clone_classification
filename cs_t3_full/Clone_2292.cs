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




public static ScrollViewer GetScrollViewer(FlowDocumentScrollViewer documentScrollViewer)
{
	    if (VisualTreeHelper.GetChildrenCount(documentScrollViewer) == 0)
		return null;
	    DependencyObject child = VisualTreeHelper.GetChild(documentScrollViewer, 0);
	    if (child == null)
		return null;
	    Decorator decorator = VisualTreeHelper.GetChild(child, 0) as Decorator;
	    if (decorator == null)
		return null;
	    return decorator.Child as ScrollViewer;
}


