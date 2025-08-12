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


private static void IsCheckedChanged(DependencyObject d, DependencyPropertyChangedEventArgs e) 
{
    if (isValueChanging)
        return;
    bool? isChecked = (bool?)e.NewValue;
    if (isChecked != null)
    {
        BindingExpression exp = BindingOperations.GetBindingExpression(d, ValueProperty);
        object dataItem = GetUnderlyingDataItem(exp.DataItem);
        FieldInfo pi = dataItem.GetType().GetField(exp.ParentBinding.Path.Path);
        byte mask = Convert.ToByte(GetMask(d));
        byte value = Convert.ToByte(pi.GetValue(dataItem));
        if (isChecked.Value)
        {
            if ((value & mask) == 0)
            {
                value = (byte)(value + mask);
            }
        }
        else
        {
            if ((value & mask) != 0)
            {
                value = (byte)(value - mask);
            }
        }
        pi.SetValue(dataItem, value);
    }
}
