public Control FindControl (Control root, string name) {
    if (root == null)
        throw new ArgumentNullException ("root");
    var stack = new Stack < Control > ();
    stack.Push (root);
    while (stack.Count > 0) {
        Control item = stack.Pop ();
        if (item.Name == name)
            return item;
        foreach (Control child in item.Controls) {
            stack.Push (child);
        }
    }
    return null;
}


 public Control FindControl(Control root, string name)
{
    if (root == null)
        throw new ArgumentNullException("root");
    Hashtable hashtable = new Hashtable();
    hashtable.Add(root, 0);
    while (hashtable.Count > 0)
    {
        Control item = (Control)hashtable.Keys.ToList()[0];
        hashtable.Remove(item);
        if (item.Name == name)
            return item;
        foreach (Control control in item.Controls)
        {
           hashtable.Add(control, 0);
        }
    }
    return null;
}


