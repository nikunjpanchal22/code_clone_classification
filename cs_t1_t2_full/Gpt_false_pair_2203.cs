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
    List<Control> list = new List<Control>();  
    list.Add(root);  
    while (list.Count > 0)  
    {  
        Control item = list[list.Count - 1];  
        list.RemoveAt(list.Count - 1);  
        if (item.Name == name)  
            return item;  
        foreach (Control control in item.Controls)  
        {  
            list.Add(control);  
        }  
    }  
    return null;  
}  

 public Control FindControl(Control root, string name)
{
    if (root == null)
        throw new ArgumentNullException("root");
    LinkedList<Control> list = new LinkedList<Control>();
    list.AddFirst(root);
    while (list.Count > 0)
    {
        Control item = list.ElementAt(0);
        list.RemoveFirst();
        if (item.Name == name)
            return item;
        foreach (Control control in item.Controls)
        {
           list.AddLast(control);
        }
    }
    return null;
}
