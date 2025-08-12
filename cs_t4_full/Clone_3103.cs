static void ResourceKeyChanged (DependencyObject d, DependencyPropertyChangedEventArgs e) {
    var target = d as FrameworkElement;
    var newVal = e.NewValue as Tuple < object, DependencyProperty >;
    if (target == null || newVal == null)
        return;
    var dp = newVal.Item2;
    if (newVal.Item1 == null) {
        target.SetValue (dp, dp.GetMetadata (target).DefaultValue);
        return;
    }
    target.SetResourceReference (dp, newVal.Item1);
}





static void ResourceKeyChanged1 (DependencyObject d, DependencyPropertyChangedEventArgs e) {
    var target = d as FrameworkElement;
    var newVal = e.NewValue as Tuple < object, DependencyProperty >;

    if (target != null && newVal != null) {
        var dp = newVal.Item2;
        target.SetValue (dp, newVal.Item1 == null ? dp.GetMetadata (target).DefaultValue : dp);
        if(newVal.Item1 != null) 
            target.SetResourceReference (dp, newVal.Item1);
    }
    return;
}


