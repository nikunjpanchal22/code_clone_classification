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
    DependencyObject current = VisualTreeHelper.GetChild(flowDocumentScrollViewer, 0);

    while (current != null)
    {
        Decorator border = current as Decorator;

        if (border != null && border.Child is ScrollViewer)
        {
            return (ScrollViewer)border.Child;
        }

        current = VisualTreeHelper.GetChild(current, 0);
    }

    return null;
}


