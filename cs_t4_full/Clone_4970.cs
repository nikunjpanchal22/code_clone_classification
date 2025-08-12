public static string GetStringValue (this AuthenticationMethod value) {
    string output = null;
    Type type = value.GetType ();
    FieldInfo fi = type.GetField (value.ToString ());
    StringValue [] attrs = fi.GetCustomAttributes (typeof (StringValue), false) as StringValue [];
    if (attrs.Length > 0)
        output = attrs [0].Value;
    return output;
}


 public static string GetStringValue (this AuthenticationMethod value) {
    Type type = value.GetType ();
    FieldInfo fi = type.GetField (value.ToString ());
    Attribute[] attributtes = Attribute.GetCustomAttributes (fi);
    string outputValue = null;
 
    foreach (Attribute attr in attributtes) {
        if (attr is StringValue) {
            outputValue = ((StringValue) attr).Value;
            break;
        }
    }
    return outputValue;
}


