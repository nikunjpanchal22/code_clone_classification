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
    if(name == null) throw new ArgumentNullException("name");
    if(root == null) return null;
    if(root.Name == name) return root;
    foreach(Control child in root.Controls){
        Control result = FindControl(child, name);
        if(result != null) return result;
    }
    return null;
}


