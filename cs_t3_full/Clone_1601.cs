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
    PriorityQueue<Control> queue = new PriorityQueue<Control>(); 
    queue.Enqueue(root, 0);
    while (queue.Count > 0)
    {
        Control item = queue.Dequeue();
        if (item.Name == name)
            return item;
        foreach (Control control in item.Controls)
        {
           queue.Enqueue(control, 0);
        }
    }
    return null;
}


