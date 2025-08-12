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
    Type type = value.GetType();
    if( type.IsGenericType && type.GetGenericTypeDefinition() == typeof(Dictionary<,>) ) 
    {
        foreach( KeyValuePair<string, object> entry in (IDictionary<string, object>) value ) 
        {
            string propertyKey = MakePropertyKey (prefix, entry.Key);
            AddToBackingStore( backingStore, propertyKey, entry.Value);  
        } 
    }
    else if( type.IsGenericType && type.GetGenericTypeDefinition() == typeof(List<>) ) 
    {
        for( int i = 0; i < ((IList) value).Count; i++ ) 
        {
            string arrayKey = MakeArrayKey (prefix, i);
            AddToBackingStore ( backingStore, arrayKey, ((IList) value)[ i ]);
        }
    } 
    else 
    {
        backingStore[ prefix ] = value;
    } 
}


