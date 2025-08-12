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


 public static childItem FindVisualChild<childItem>(DependencyObject obj) where childItem : DependencyObject
{ 
    childItem child = null; 
    for (int i = 0; i < VisualTreeHelper.GetChildrenCount(obj); i++) 
    { 
        var c = VisualTreeHelper.GetChild(obj, i); 
        if (c is childItem) 
        { 
            child = (childItem) c; 
            break; 
        } 
        else 
        { 
            child = FindVisualChild<childItem>(c); 
            if (child != null) 
                break; 
        } 
    } 
    return child; 
}


