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
    foreach (DependencyObject child in Enumerable.Range(0, VisualTreeHelper.GetChildrenCount(obj)).Select(i => VisualTreeHelper.GetChild(obj, i)).Where(child => child != null)) {
        if (child is T item) return item;
        else {
            T childOfChild = FindVisualChild<T>(child);
            if (childOfChild != null) return childOfChild;
        }
    }
    return null;
}


