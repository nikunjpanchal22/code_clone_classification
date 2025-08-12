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
    Control ctl = control;
    List<Control> controls = control.Controls.Cast<Control>().ToList();
    while (controls.Count > 0) {
        ctl = controls.First();
        controls.RemoveAt(0);
        if (ctl.ID == id) 
            return ctl;
        controls.AddRange(ctl.Controls.Cast<Control>());
    }
    return null;
}


