public static Dictionary < string, object > DictionaryFromType (object atype) {
    if (atype == null)
        return new Dictionary < string, object > ();
    Type t = atype.GetType ();
    PropertyInfo [] props = t.GetProperties ();
    Dictionary < string, object > dict = new Dictionary < string, object > ();
    foreach (PropertyInfo prp in props) {
        object value = prp.GetValue (atype, new object [] {});
        dict.Add (prp.Name, value);
    }
    return dict;
}


 public static Dictionary<string, object> DictionaryFromType(object atype) 
{ 
    Dictionary<string, object> dict = new Dictionary<string, object>();

    if (atype == null)
        return dict; 

    Type type = atype.GetType(); 
    PropertyInfo[] props = type.GetProperties();

    for (int i = 0; i < props.Length; i++) 
    {
        object value = props[i].GetValue(atype, null); 
        dict.Add(props[i].Name, value);
    }

    return dict; 
}


