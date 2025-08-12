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




public static TChild FindVisualChild<TChild>(DependencyObject obj) where TChild : DependencyObject
{
    for (var i = 0; i < VisualTreeHelper.GetChildrenCount(obj); i++)
    {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is TChild item)
        {
            return item;
        }

        var childItem = FindVisualChild<TChild>(child);
        if (childItem != null)
        {
            return childItem;
        }
    }

    return null;
}


