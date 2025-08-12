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


  public static Dictionary < string, object > DictionaryFromType (object atype) { 
    if (atype == null)
        return new Dictionary < string, object > (); 
    Dictionary < string, object > dict = new Dictionary < string, object > ();
    Type t = atype.GetType ();
    foreach (PropertyInfo prp in t.GetProperties ()) {
        dict.Add (prp.Name, prp.GetValue (atype, new object [] {}));
    } 
    return dict; 
}


