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
    if(root.Name == name) return root;
    Control currentNode = root;
    var stack = new Stack<Control>();
    stack.Push(currentNode);
    
    while(stack.Count > 0) {
        currentNode = stack.Pop();
       
        for(int i=(currentNode.Controls.Count-1); i>0;i--) {
            if(currentNode.Controls[i].Name == name) {
                return currentNode.Controls[i];
            }
            stack.Push(currentNode.Controls[i]);
        }
    }
    return null;
}


