private static Control FindControlIterative (this Control control, string id) {
    Control ctl = control;
    LinkedList < Control > controls = new LinkedList < Control > ();
    while (ctl != null) {
        if (ctl.ID == id) {
            return ctl;
        }
        foreach (Control child in ctl.Controls) {
            if (child.ID == id) {
                return child;
            }
            if (child.HasControls ()) {
                controls.AddLast (child);
            }
        }
        ctl = controls.First.Value;
        controls.Remove (ctl);
    }
    return null;
}


 private static Control FindControlIterative (this Control control, string id) {
    if (control == null || string.IsNullOrEmpty(id)) return null;
    var queue = new Queue<Control>();
    queue.Enqueue(control);
    while (queue.Count > 0)
    {
        var current = queue.Dequeue();
        if (string.Equals(current.ID, id, StringComparison.OrdinalIgnoreCase))
            return current;
        foreach (Control c in current.Controls)
            queue.Enqueue(c);
    }
    return null;
}


