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
    var treeView = obj as TreeView;
    if (treeView == null)
        return;
    var newValue = (bool) e.NewValue;
    if (newValue)
        treeView.SelectionChanged += treeViewSelectionChanged;
    else
        treeView.SelectionChanged -= treeViewSelectionChanged;
}
