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
	string strEnumValue = "";	

	if (value == AuthenticationMethod.UsernamePassword)
		strEnumValue = "UsernamePassword";
	else if (value == AuthenticationMethod.MobileApp)
		strEnumValue = "MobileApp";
	// add more expressions

	return strEnumValue;
}


