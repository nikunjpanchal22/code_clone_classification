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


 public static ChildItem FindVisualChild<ChildItem>(DependencyObject obj) 
    where ChildItem : DependencyObject
{
    ChildItem visualChild = null;

    for (int i = 0; i < VisualTreeHelper.GetChildrenCount(obj); i++)
    {
        var child = VisualTreeHelper.GetChild(obj, i);
        if (child is ChildItem) 
        {
            visualChild = (ChildItem)child;
            break;
        }
        else
        {
            visualChild = FindVisualChild<ChildItem>(child);
            if(visualChild != null)
                break;
        }
    }

    return visualChild;
}


