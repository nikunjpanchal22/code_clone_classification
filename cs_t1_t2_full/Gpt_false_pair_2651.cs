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


public Control FindControl(Control root, string name) {
    if (root == null)
        throw new ArgumentNullException("root");
    Queue<Control> queue = new Queue<Control>();
    queue.Enqueue(root);
    while (queue.Count > 0) {
        Control item = queue.Dequeue();
        if (item.Name == name)
            return item;
        foreach (Control child in item.Controls) {
            queue.Enqueue(child);
        }
    }
    return null;
}
