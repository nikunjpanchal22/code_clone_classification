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



public static ConcurrentDictionary < int, string > GetListItems (Type enumType) {
    if (! enumType.IsEnum)
        throw new ArgumentException("Invalid argument. Expected enum type");
    ConcurrentDictionary < int, string > list = new ConcurrentDictionary < int, string > ();
    var enumValues = Enum.GetValues(enumType).Cast<int>();
    foreach (int value in enumValues) {
        string display = Enum.GetName (enumType, value);
        list.TryAdd (value, display);
    }
    return list;
}


