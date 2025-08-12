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


 public static Dictionary<string, object> DictionaryFromType (object typeObject) {
    if (typeObject == null)
        return new Dictionary<string, object>(); 
    Type t = typeObject.GetType();
    Dictionary<string, object> dict = new Dictionary<string, object>();
    PropertyInfo[] properties = t.GetProperties();
    foreach (PropertyInfo prop in properties) {
        object value = prop.GetValue(typeObject, new object[] {}); 
        dict.Add(prop.Name, value);
    } 
    return dict;
}
