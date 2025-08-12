private static void ComboBox_SelectionChanged (object sender, SelectionChangedEventArgs e) {
    var comboBox = sender as ComboBox;
    if (comboBox != null && ! (bool) comboBox.Tag) {
        var bndExp = comboBox.GetBindingExpression (Selector.SelectedValueProperty);
        var currentItem = (KeyValuePair < int, int >) comboBox.SelectedItem;
        if (currentItem.Key >= 1 && currentItem.Key <= 4 && bndExp != null) {
            var dr = MessageBox.Show ("Want to select a Key of between 1 and 4?", "Please Confirm.", MessageBoxButton.YesNo, MessageBoxImage.Warning);
            if (dr == MessageBoxResult.Yes) {
                bndExp.UpdateSource ();
            } else {
                comboBox.Tag = true;
                bndExp.UpdateTarget ();
                comboBox.Tag = false;
            }
        }
    }
}


 private static void ComboBox_SelectionChanged (object sender, SelectionChangedEventArgs e) 
{
    var comboBox = sender as ComboBox;
    if (comboBox != null && ! (bool) comboBox.Tag) 
    {
        var bndExp = comboBox.GetBindingExpression (Selector.SelectedValueProperty);
        var currentItem = (KeyValuePair < int, int >) comboBox.SelectedItem;
        if (currentItem.Key >= 1 && currentItem.Key <= 4 && bndExp != null) 
        {
            var dr = MessageBox.Show ("Do you need to make the Key selection betwee 1 and 4?", "Please Confirm.", MessageBoxButton.YesNo, MessageBoxImage.Warning);
            if (dr == MessageBoxResult.Yes) 
            {
                bndExp.UpdateSource ();
            } 
            else 
            {
                comboBox.Tag = true;
                bndExp.UpdateTarget ();
                comboBox.Tag = false;
            }
        }
    }
}
