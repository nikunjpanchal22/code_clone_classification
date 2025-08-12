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


 ScrollViewer FindScrollViewer(FlowDocumentScrollViewer flowDocumentScrollViewer)
{
    if (VisualTreeHelper.GetChildrenCount(flowDocumentScrollViewer) == 0)
    {
        return null;
    }

    DependencyObject firstChild = VisualTreeHelper.GetChild(flowDocumentScrollViewer, 0);

    if (firstChild == null)
    {
        return null;
    }

    Decorator border = VisualTreeHelper.GetChild(firstChild, 0) as Decorator;

    if (border == null)
    {
        return null;
    }

    ScrollViewer scroll = null;

    if (border.Child is ScrollViewer) 
    {
        scroll = border.Child as ScrollViewer;
    }

    return scroll;
}


