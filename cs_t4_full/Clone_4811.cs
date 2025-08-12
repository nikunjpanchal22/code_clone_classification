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
    if( value is IDictionary ) 
    {
        foreach( DictionaryEntry entry in (IDictionary) value ) 
        {
            string propertyKey = MakePropertyKey (prefix, (string)entry.Key);
            AddToBackingStore( backingStore, propertyKey, (object)entry.Value);  
        } 
    }
    else if( value is IEnumerable ) 
    {
        IEnumerator enumerator = (value as IEnumerable).GetEnumerator();
        int index = 0;
        while(enumerator.MoveNext())
        {
            string arrayKey = MakeArrayKey (prefix, index);
            AddToBackingStore ( backingStore, arrayKey, enumerator.Current);
            index++;
        }
    } 
    else 
    {
        backingStore[ prefix ] = value;
    } 
}


