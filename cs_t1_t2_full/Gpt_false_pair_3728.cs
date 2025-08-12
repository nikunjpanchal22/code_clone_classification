public static void OnAutoScrollToCurrentItemChanged (DependencyObject obj, DependencyPropertyChangedEventArgs e) {
    var listBox = obj as ListBox;
    if (listBox == null)
        return;
    var newValue = (bool) e.NewValue;
    if (newValue)
        listBox.SelectionChanged += listBoxSelectionChanged;
    else
        listBox.SelectionChanged -= listBoxSelectionChanged;
}


public static void OnAutoScrollToCurrentItemChanged (DependencyObject obj, DependencyPropertyChangedEventArgs e) {
    var comboBox = obj as ComboBox;
    if (comboBox == null)
        return;
    var newValue = (bool) e.NewValue;
    if (newValue)
        comboBox.SelectionChanged += comboBoxSelectionChanged;
    else
        comboBox.SelectionChanged -= comboBoxSelectionChanged;
}
