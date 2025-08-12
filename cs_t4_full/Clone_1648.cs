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


 public static childItem FindVisualChild<childItem>(DependencyObject obj) 
    where childItem : DependencyObject
{ 
    childItem result = null; 
    int childCount = VisualTreeHelper.GetChildrenCount(obj); 
    for (int i = 0; i < childCount; i++) 
    { 
        var child = VisualTreeHelper.GetChild(obj, i); 
        if (child is childItem) 
        { 
            result = (childItem)child; 
            break; 
        } 
        else 
        { 
            result = FindVisualChild<childItem>(child); 
            if (result != null) 
                break; 
        } 
    } 
    return result; 
} 


