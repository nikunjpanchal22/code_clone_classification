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


 public static ScrollViewer FindScrollViewer(FlowDocumentScrollViewer flowDocumentScrollViewer) {
    if (flowDocumentScrollViewer != null && VisualTreeHelper.GetChildrenCount(flowDocumentScrollViewer) > 0) {
        DependencyObject firstChild = VisualTreeHelper.GetChild(flowDocumentScrollViewer, 0);
        
        if (firstChild != null && firstChild is Decorator decorator && decorator.Child != null)
            return decorator.Child as ScrollViewer;
    }
    
    return null;
}


