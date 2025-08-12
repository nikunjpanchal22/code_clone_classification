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
	string output = string.Empty;
	Type type = value.GetType ();
	FieldInfo fi = type.GetField (value.ToString ());
	object[] attrs = fi.GetCustomAttributes (typeof (StringValue), false);

	for (int i = 0; i < attrs.Length; i++) {
    	if (attrs[i] is StringValue) {
        	output = ((StringValue)attrs[i]).Value;
        	break;
    	}
	}

	return output;
}


