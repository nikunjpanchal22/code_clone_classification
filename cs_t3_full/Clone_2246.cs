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




public static TChildType FindVisualChild<TChildType>(DependencyObject depObj) where TChildType : DependencyObject
{
    if (depObj == null) return null;

    for (int i = 0; i < VisualTreeHelper.GetChildrenCount(depObj); i++)
    {
        var child = VisualTreeHelper.GetChild(depObj, i);

        var visualChild = child as TChildType;
        if (visualChild != null)
        {
            return visualChild;
        }

        var childItem = FindVisualChild<TChildType>(child);

        if (childItem != null) return childItem;
    }

    return null;
}


