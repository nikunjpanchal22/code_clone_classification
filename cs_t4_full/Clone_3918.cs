public static Dictionary < int, string > GetListItems (Type enumType) {
    if (! enumType.IsEnum)
        throw new ApplicationException ("GetListItems does not support non-enum types");
    Dictionary < int, string > list = new Dictionary < int, string > ();
    foreach (FieldInfo field in enumType.GetFields (BindingFlags.Static | BindingFlags.GetField | BindingFlags.Public)) {
        int value;
        string display;
        value = (int) field.GetValue (null);
        display = Enum.GetName (enumType, value);
        foreach (Attribute currAttr in field.GetCustomAttributes (true)) {
            EnumValueDataAttribute valueAttribute = currAttr as EnumValueDataAttribute;
            if (valueAttribute != null)
                display = valueAttribute.Name;
        }
        list.Add (value, display);
    }
    return list;
}



public static IDictionary < int, string > GetListItems (Type enumType) {
    if (! enumType.IsEnum)
        throw new FrankException("Invalid type. Expected enum");
    IDictionary < int, string > list = new Dictionary < int, string > ();
    foreach (FieldInfo field in enumType.GetFields(BindingFlags.Static | BindingFlags.Public)) {
        int value = (int) field.GetValue (null);
        string display = Enum.GetName(enumType, value);
        list.Add (value, display);
    }
    return list;
}


