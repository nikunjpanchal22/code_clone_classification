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




public static childItem FindVisualChild<childItem>(DependencyObject obj) where childItem : DependencyObject {
    var count = VisualTreeHelper.GetChildrenCount(obj);
    for (var i = 0; i < count; i++) {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is childItem item) return item;
        var childOfChild = FindVisualChild<childItem>(child);
        if (childOfChild != null) return childOfChild;
    }
    return null;
}


