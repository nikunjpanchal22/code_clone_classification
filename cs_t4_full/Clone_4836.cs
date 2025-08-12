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
    Stack < Control > controls = new Stack < Control > ();
    controls.Push(control);
    Control root = control;
    bool isChild = false;
    
    while (controls.Count > 0) {
        Control ctl = controls.Pop();
        if(isChild == false && ctl == root){
            isChild = true;
        }
        if (ctl.ID == id) {
            return ctl;
        }
        if (ctl.HasControls ()) {
            foreach (Control child in ctl.Controls) {
                if (child.ID == id) {
                    return child;
                }
                if(isChild){
                    controls.Push (child);
                }
            }
        }
    }
    return null;
}


