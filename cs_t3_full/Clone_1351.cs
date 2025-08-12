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
    Control ctl = control;
    List<Control> controls = new List<Control>();
    while (ctl != null) 
    {
        if (ctl.ID == id) 
            return ctl;

        foreach (Control child in ctl.Controls) 
        {
            if (child.ID == id) 
                return child;

            if (control.HasControls()) 
                controls.AddRange(child.Controls);
        }
        ctl = controls.Last();
        controls.RemoveAt(controls.Count-1);
    }
    return null;
}


