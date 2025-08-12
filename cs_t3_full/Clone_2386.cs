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
    var newVal = e.NewValue as Tuple < object, DependencyProperty >;
    if (target == null || newVal == null)
        return;
    var dp = newVal.Item2;
    if (newVal.Item1 == null) {
        DependencyPropertyMetadata metaData = dp.GetMetadata(target);
        target.SetValue (dp, metaData.DefaultValue);
        return;
    }
    target.SetResourceReference (dp, newVal.Item1);
    target.DataContext = newVal.Item1;
}


