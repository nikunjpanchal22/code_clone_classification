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
	string outputValue = "";
	try
	{
		Type type = value.GetType();
		var fields = type.GetFields(BindingFlags.Public | BindingFlags.Static);

		foreach (var item in fields)
		{
			if (item.Name == value.ToString())
			{
				var attrs = item.GetCustomAttributes<StringValueAttribute>();
				foreach (var attr in attrs)
				{
					outputValue = attr.Value;
					break;
				}
			}
		}
	}
	catch (Exception exception)
	{
		//TODO: log Exception
	}
	return outputValue;
}


