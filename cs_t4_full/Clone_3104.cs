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





static void ResourceKeyChanged10(DependencyObject d, DependencyPropertyChangedEventArgs e)
{
    if (d is FrameworkElement target && e.NewValue is Tuple<object, DependencyProperty> newVal)
    {
        var dp = newVal.Item2;
        var value = newVal.Item1;

        if (value == null)  target.SetValue(dp, dp.GetMetadata(target).DefaultValue);
        else target.SetResourceReference(dp, value);
    }
}


