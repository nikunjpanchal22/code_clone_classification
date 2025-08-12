public static childItem FindVisualChild < childItem > (DependencyObject obj) where childItem : DependencyObject {
    for (int i = 0; i < VisualTreeHelper.GetChildrenCount (obj); i ++) {
        DependencyObject child = VisualTreeHelper.GetChild (obj, i);
        if (child != null && child is childItem)
            return (childItem) child;
        else {
            childItem childOfChild = FindVisualChild < childItem > (child);
            if (childOfChild != null)
                return childOfChild;
        }
    }
    return null;
}




public static TChildItem FindVisualChild<TChildItem>(DependencyObject obj) where TChildItem : DependencyObject {
    TChildItem foundChild = null;
    var childrenCount = VisualTreeHelper.GetChildrenCount(obj);
    for (var i = 0; i < childrenCount; i++) {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is TChildItem)
        {
            foundChild = (TChildItem)child;
            break;
        }
        else
        {
            foundChild = FindVisualChild<TChildItem>(child);
            if (foundChild != null)
                break;
        }
    }
    return foundChild;
}


