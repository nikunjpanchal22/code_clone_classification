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


 private void DragDropTarget_DragEnter(object sender, Microsoft.Windows.DragEventArgs e) {
    e.Handled = true;
 
    if(sender is DataGridDragDropTarget sw) {
        if(GetAssignmentCondition(e))
            e.Effects = DragDropEffects.Link;
        else
            e.Effects = DragDropEffects.None;
    }
}


