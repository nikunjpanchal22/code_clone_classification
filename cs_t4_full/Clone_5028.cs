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


 public Control FindControl (Control root, string name) {
    if (root == null)
        throw new ArgumentNullException ("root");

     Control item = root; 
    
    if (item.Name == name)
        return item;

    for(int i=0; i<item.Controls.Count; i++){
        var child = item.Controls[i];
        if(item.Name == name) return item;
        else item = FindControl(child, name);
    }
    return null;
}


