public void Add (Type type) {
    if (! type.IsVisible) {
        return;
    }
    var members = type.GetMembers (BindingFlags.Instance | BindingFlags.Static | BindingFlags.NonPublic | BindingFlags.Public);
    foreach (var member in members) {
        Add (type, member);
    }
}


 public void Add(Type type)
{
    if(type.IsVisible == false)
    {
        return;
    }
    var members = type.GetMembers(
        BindingFlags.Instance | 
        BindingFlags.Static | 
        BindingFlags.NonPublic |  
        BindingFlags.Public);
    foreach (var member in members) 
    {
        Add(type, member);
    }
}
