private void DragDropTarget_DragEnter (object sender, Microsoft.Windows.DragEventArgs e) {
    var sw = sender as DataGridDragDropTarget;
    if (sw == null) {
        return;
    }
    if (GetAssignmentCondition (e)) {
        e.Effects = DragDropEffects.Link;
    } else {
        e.Effects = DragDropEffects.None;
    }
    e.Handled = true;
}


private void DragDropTarget_DragEnter (object sender, Microsoft.Windows.DragEventArgs e) {
    if ((sender as DataGridDragDropTarget) == null) {
        return;
    } 
    if (GetAssignmentCondition (e)) {
        e.Effects = DragDropEffects.Link;
    } else {
        e.Effects = DragDropEffects.None;
    }
    e.Handled = true;
}
