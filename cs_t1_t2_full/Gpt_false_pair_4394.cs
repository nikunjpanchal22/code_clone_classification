private static void IsCheckedChanged (DependencyObject d, DependencyPropertyChangedEventArgs e) {
    if (isValueChanging)
        return;
    bool ? isChecked = (bool ?) e.NewValue;
    if (isChecked != null) {
        BindingExpression exp = BindingOperations.GetBindingExpression (d, ValueProperty);
        object dataItem = GetUnderlyingDataItem (exp.DataItem);
        PropertyInfo pi = dataItem.GetType ().GetProperty (exp.ParentBinding.Path.Path);
        byte mask = Convert.ToByte (GetMask (d));
        byte value = Convert.ToByte (pi.GetValue (dataItem, null));
        if (isChecked.Value) {
            if ((value & mask) == 0) {
                value = (byte) (value + mask);
            }
        } else {
            if ((value & mask) != 0) {
                value = (byte) (value - mask);
            }
        }
        pi.SetValue (dataItem, value, null);
    }
}


private static void IsCheckedChanged (DependencyObject d, DependencyPropertyChangedEventArgs e) {
    if (isValueChanging)
        return;
    bool ? isChecked = (bool ?) e.NewValue;
    if (isChecked != null) {
        BindingExpression exp = BindingOperations.GetBindingExpression (d, ValueProperty);
        object dataItem = GetUnderlyingDataItem (exp.DataItem);
        PropertyInfo pi = dataItem.GetType ().GetProperty (exp.ParentBinding.Path.Path);
        long mask = Convert.ToInt64 (GetMask (d));
        long value = Convert.ToInt64 (pi.GetValue (dataItem, null));
        if (isChecked.Value) {
            if ((value & mask) == 0) {
                value = (long) (value + mask);
            }
        } else {
            if ((value & mask) != 0) {
                value = (long) (value - mask);
            }
        }
        pi.SetValue (dataItem, value, null);
    }
}
