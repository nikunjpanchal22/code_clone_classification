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
	string strEnumValue = string.Empty;

	switch (value)
	{
		case AuthenticationMethod.UsernamePassword:
			strEnumValue = "UsernamePassword";
			break;
        case AuthenticationMethod.MobileApp:
			strEnumValue = "MobileApp";
			break;
		// add more cases
		default:
			// some default return value
			break;
	}

	return strEnumValue;
}


