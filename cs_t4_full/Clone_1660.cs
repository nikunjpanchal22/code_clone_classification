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


 public static Dictionary<string, object> DictionaryFromType (object atype) {
    Dictionary<string, object> dict = new Dictionary<string, object>();
    if (atype == null) return dict; 
    PropertyInfo[] properties = atype.GetType().GetProperties();
    foreach (PropertyInfo prop in properties) {
        dict.Add(prop.Name, prop.GetValue(atype, new object[] { }));
    }
    return dict;
}


