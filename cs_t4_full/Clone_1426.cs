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


 private static Control FindControlIterative(this Control control, string id) 
{
    Queue<Control> controls = new Queue<Control>();
    controls.Enqueue(control);

    while (controls.Count > 0)
    {
        Control ctl = controls.Dequeue();
        if (ctl.ID == id) 
            return ctl;

        foreach (Control child in ctl.Controls) 
        {
            if (child.ID == id) 
                return child;
            
            if (child.HasControls()) 
                controls.Enqueue(child);
        }
    } 
    return null;
}


