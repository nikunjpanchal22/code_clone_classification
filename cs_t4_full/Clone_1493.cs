public static void AssignValueToProperty (this ObjectAccessor accessor, string propertyName, object value) {
    var index = propertyName.IndexOf ('.');
    if (index == - 1) {
        accessor [propertyName] = value;
    } else {
        accessor = ObjectAccessor.Create (accessor [propertyName.Substring (0, index)]);
        AssignValueToProperty (accessor, propertyName.Substring (index + 1), value);
    }
}


// Implementation 9
public static void AssignValueToProperty (ObjectAccessor accessor, string propertyName, object value) 
{
    if (propertyName.IndexOf ('.') != -1) 
    { 
        var index = propertyName.IndexOf ('.');
        accessor = ObjectAccessor.Create (accessor [propertyName.Substring (0, index)]);
        AssignValueToProperty (accessor, propertyName.Substring (index + 1), value);
    } 
    else
    {
        accessor[propertyName] = value;
    }
}


