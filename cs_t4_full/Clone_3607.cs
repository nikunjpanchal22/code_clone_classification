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
    Control found = root.Controls.FirstOrDefault(x => x.Name == name);
    if(found != null)
        return found;
    else
        return FindControl(root, name);
}


