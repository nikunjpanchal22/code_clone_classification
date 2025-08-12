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
    if(root == null) throw new ArgumentNullException("root");
    if(root.Name == name) return root;

    foreach(Control control in root.Controls){
        Control findControl = FindControl(control, name);
        if(findControl != null) return findControl;
    }
    return null;
}


