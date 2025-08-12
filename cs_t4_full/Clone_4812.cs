private static void AddToBackingStore (Dictionary < string, object > backingStore, string prefix, object value) {
    IDictionary < string, object > d = value as IDictionary < string, object >;
    if (d != null) {
        foreach (KeyValuePair < string, object > entry in d) {
            AddToBackingStore (backingStore, MakePropertyKey (prefix, entry.Key), entry.Value);
        }
        return;
    }
    IList l = value as IList;
    if (l != null) {
        for (int i = 0; i < l.Count; i ++) {
            AddToBackingStore (backingStore, MakeArrayKey (prefix, i), l [i]);
        }
        return;
    }
    backingStore [prefix] = value;
}


 private static void AddToBackingStore( Dictionary<string, object> backingStore, string prefix, object value ) 
{ 
    if( value is IDictionary<string, object> ) 
    {
        IDictionary<string, object> d = (IDictionary<string, object>) value;
        foreach( KeyValuePair<string, object> entry in d ) 
        {
            string propertyKey = MakePropertyKey (prefix, entry.Key);
            AddToBackingStore( backingStore, propertyKey, entry.Value);  
        } 
    }
    else if( value is IList ) 
    {
        IList l = (IList) value;
        for( int i = 0; i < l.Count; i++ ) 
        {
            string arrayKey = MakeArrayKey (prefix, i);
            AddToBackingStore ( backingStore, arrayKey, l[ i ]);
        }
    } 
    else 
    {
        backingStore[ prefix ] = value;
    } 
}


