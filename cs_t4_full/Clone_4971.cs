public static string GetStringValue (this AuthenticationMethod value) {
    string output = null;
    Type type = value.GetType ();
    FieldInfo fi = type.GetField (value.ToString ());
    StringValue [] attrs = fi.GetCustomAttributes (typeof (StringValue), false) as StringValue [];
    if (attrs.Length > 0)
        output = attrs [0].Value;
    return output;
}


 public static string GetStringValue(this AuthenticationMethod value) 
{
	string outputValue = string.Empty;
	Type type = value.GetType();
	FieldInfo fi = type.GetField(value.ToString());
	StringValueAttribute attrs = fi.GetCustomAttribute(typeof(StringValueAttribute)) as StringValueAttribute;
	if (attrs != null)
		outputValue = attrs.Value;

	return outputValue;
}


