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




public static T FindVisualChild<T>(DependencyObject obj) where T : DependencyObject {
    for (int i = 0; i < VisualTreeHelper.GetChildrenCount(obj); i++) {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is T item) return item;
        var childOfChild = FindVisualChild<T>(child);
        if (childOfChild != null) return childOfChild;
    }
    return null;
}


