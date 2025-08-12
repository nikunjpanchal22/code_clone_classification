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





static void ResourceKeyChanged3 (DependencyObject d, DependencyPropertyChangedEventArgs e) {
		    var target = d as FrameworkElement;
		    var newVal = e.NewValue as Tuple < object, DependencyProperty >;

		    if (target != null && newVal != null)
		    {
			var dp = newVal.Item2;
			if(newVal.Item1 == null) {
			    SetDefaultValue( target, dp);
			} else  {
			    target.SetResourceReference (dp, newVal.Item1);
			}
		    }
		}

		private static void SetDefaultValue(FrameworkElement target, DependencyProperty dp)
		{
		    var newValue = dp.GetMetadata(target).DefaultValue;
		    target.SetValue(dp, newValue);
}


