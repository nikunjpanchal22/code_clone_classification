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
    var stack = new Stack<Control>(control.Controls.Cast<Control>());
    while(stack.Count > 0) {
        var currentControl = stack.Pop();
        if (currentControl.ID == id) 
            return currentControl;
        foreach (Control child in currentControl.Controls)
	        stack.Push(child);
    }
    return null;
}


