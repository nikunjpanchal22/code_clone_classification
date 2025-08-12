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
    Dictionary<Control, int> dic = new Dictionary<Control, int>(); 
    dic.Add(root, 0); 
    while (dic.Count > 0) 
    { 
        Control item = dic.Keys.ToList()[0]; 
        dic.Remove(item); 
        if (item.Name == name) 
            return item; 
        foreach (Control control in item.Controls) 
        { 
           dic.Add(control, 0); 
        } 
    } 
    return null; 
} 


