public static string GetStringValue (this AuthenticationMethod value) {
    string output = null;
    Type type = value.GetType ();
    FieldInfo fi = type.GetField (value.ToString ());
    StringValue [] attrs = fi.GetCustomAttributes (typeof (StringValue), false) as StringValue [];
    if (attrs.Length > 0)
        output = attrs [0].Value;
    return output;
}


 public static string GetStringValue(this AuthenticationMethod value) {
    var output = string.Empty;

    Type type = value.GetType();
    FieldInfo fi = type.GetField(value.ToString());
    var attributes = Attribute.GetCustomAttributes(fi);

    foreach (var item in attributes)
    {
        if (item is StringValue)
        {
            output = (item as StringValue).Value;
            break;
        }
    }

    return output;
}


