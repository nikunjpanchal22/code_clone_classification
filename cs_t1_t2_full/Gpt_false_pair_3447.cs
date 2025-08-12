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
    var sw = sender as GeometryRepresentationViewer;
    if (sw != null) {
        if (GetAssignmentCondition (e)) {
            e.Effects = DragDropEffects.Move;
        } else {
            e.Effects = DragDropEffects.Copy;
        }
        e.Handled = true;
    }
}
