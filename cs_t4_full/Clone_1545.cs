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
    var sw = sender as DataGridDragDropTarget;
    if (sw != null) {
        e.Effects = GetAssignmentCondition(e) 
                        ? DragDropEffects.Link 
                        : DragDropEffects.None;
    }    
    e.Handled = true;
}


