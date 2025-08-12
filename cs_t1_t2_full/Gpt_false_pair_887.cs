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
    var listBox = obj as ListBox;
    if (listBox == null)
        return;
    var newValue = (bool) e.NewValue;
    if (newValue)
        listBox.SelectionChanged += ListBoxSelection_Changed;
    else
        listBox.SelectionChanged -= ListBoxSelection_Changed;
}
