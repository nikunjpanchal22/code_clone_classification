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


 static void ResourceKeyChanged (DependencyObject d, DependencyPropertyChangedEventArgs e) {
    var target = d as FrameworkElement;
    if (target == null)
        return;
 
    var newVal = e.NewValue as Tuple<object, DependencyProperty>;
    if (newVal != null) {
        var dp = newVal.Item2;
        target.SetResourceReference (dp, newVal.Item1);
        return;
    }
    //fallback value
    target.SetValue (e.Property, e.Property.GetMetadata(target).DefaultValue);
}


