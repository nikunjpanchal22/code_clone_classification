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
    if (obj == null)
    {
        return null; 
    }
    
    ChildItem result = null;
    int childrenCount = VisualTreeHelper.GetChildrenCount(obj);
    for (int i = 0; i < childrenCount; i++)
    {        
        DependencyObject child = VisualTreeHelper.GetChild(obj, i);
        if (child is ChildItem)
        {
            result = (ChildItem)child;
            break;
        }
        else
        {
            result = FindVisualChild<ChildItem>(child);
            if (result != null)
                break;
        } 
    }
    return result;
}


