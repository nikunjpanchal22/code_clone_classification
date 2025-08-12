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


 public static ScrollViewer FindScrollViewer (FlowDocumentScrollViewer flowDocumentScrollViewer){
    int childrenCount = VisualTreeHelper.GetChildrenCount(flowDocumentScrollViewer);
    
    if(childrenCount == 0)
        return null;
    
    DependencyObject firstChild = VisualTreeHelper.GetChild(flowDocumentScrollViewer, 0);
    
    if (firstChild == null)
        return null;
    
    Decorator border = firstChild as Decorator;
    if (border != null && border.Child != null)
        return border.Child as ScrollViewer;
    else
        return null;
}


