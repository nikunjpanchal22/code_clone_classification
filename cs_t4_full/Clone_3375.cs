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
    Queue < Control > queue = new Queue < Control > ();
    queue.Enqueue(control);
    while (queue.Any()) {
        var current = queue.Dequeue();
        if (current.ID == id) return current;
        foreach (Control child in current.Controls) 
            queue.Enqueue(child);
    }
    return null;
}


