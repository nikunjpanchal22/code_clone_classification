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




public static TChildItem FindVisualChild<TChildItem>(DependencyObject obj) where TChildItem : DependencyObject
{
    int childrenCount = VisualTreeHelper.GetChildrenCount(obj);
    for (int i = 0; i < childrenCount; i++)
    {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is TChildItem childItem)
            return childItem;
        else
        {
            var childOfChild = FindVisualChild<TChildItem>(child);
            if (childOfChild != null)
                return childOfChild;
        }
    }
    return null;
}


