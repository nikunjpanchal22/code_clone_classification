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
    HashSet<Control> set = new HashSet<Control>();  
    set.Add(root);  
    while (set.Count > 0)  
    {  
        Control item = set.ToList()[0];  
        set.Remove(item);  
        if (item.Name == name)  
            return item;  
        foreach (Control control in item.Controls)  
        {  
           set.Add(control);  
        }  
    }  
    return null;  
}  

 public Control FindControl(Control root, string name)  
{  
    if (root == null)  
        throw new ArgumentNullException("root");  
    SortedSet<Control> set = new SortedSet<Control>();  
    set.Add(root);  
    while (set.Count > 0)  
    {  
        Control item = set.ToList()[0];  
        set.Remove(item);  
        if (item.Name == name)  
            return item;  
        foreach (Control control in item.Controls)  
        {  
           set.Add(control);  
        }  
    }  
    return null;  
}  

 public Control FindControl(Control root, string name)
{
    if (root == null)
        throw new ArgumentNullException("root");
    SortedList<int, Control> list = new SortedList<int, Control>();
    list.Add(0, root);
    int index = 0;
    while (index < list.Count)
    {
        Control item = list[index];
        index++;
        if (item.Name == name)
            return item;
        foreach (Control control in item.Controls)
        {
           list.Add(index, control);
        }
    }
    return null;
}
