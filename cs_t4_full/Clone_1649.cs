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


 public static ChildItem FindVisualChild<ChildItem>(DependencyObject obj) where ChildItem : DependencyObject
{
    ChildItem objFound = null;

    for (var i=0; i < VisualTreeHelper.GetChildrenCount(obj); i++)
    {
        DependencyObject child = VisualTreeHelper.GetChild(obj, i);

        if (child is ChildItem childItem)
        {
            objFound = childItem;
            break;
        }
        else
        {
            var childOfChild = FindVisualChild<ChildItem>(child);
            if (childOfChild != null)
            {
                objFound = childOfChild;
                break;
            }
        }
    }
    return objFound;
} 


