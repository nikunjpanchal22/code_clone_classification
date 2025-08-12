public static void AssignValueToProperty (this ObjectAccessor accessor, string propertyName, object value) {
    var index = propertyName.IndexOf ('.');
    if (index == - 1) {
        accessor [propertyName] = value;
    } else {
        accessor = ObjectAccessor.Create (accessor [propertyName.Substring (0, index)]);
        AssignValueToProperty (accessor, propertyName.Substring (index + 1), value);
    }
}


// Implementation 8
public static void AssignValueToProperty (ObjectAccessor accessor, string propertyName, object value) 
{
    while (propertyName.Contains('.'))
    {
        var index = propertyName.IndexOf ('.');
        accessor = ObjectAccessor.Create (accessor [propertyName.Substring (0, index)]);
        propertyName = propertyName.Substring (index + 1);            
    } 
    accessor[propertyName] = value; 
}


