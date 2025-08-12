public static object GetPropertyValue (object srcobj, string propertyName) {
    if (srcobj == null)
        return null;
    object obj = srcobj;
    string [] propertyNameParts = propertyName.Split ('.');
    foreach (string propertyNamePart in propertyNameParts) {
        if (obj == null)
            return null;
        if (! propertyNamePart.Contains ("[")) {
            PropertyInfo pi = obj.GetType ().GetProperty (propertyNamePart);
            if (pi == null)
                return null;
            obj = pi.GetValue (obj, null);
        } else {
            int indexStart = propertyNamePart.IndexOf ("[") + 1;
            string collectionPropertyName = propertyNamePart.Substring (0, indexStart - 1);
            int collectionElementIndex = Int32.Parse (propertyNamePart.Substring (indexStart, propertyNamePart.Length - indexStart - 1));
            PropertyInfo pi = obj.GetType ().GetProperty (collectionPropertyName);
            if (pi == null)
                return null;
            object unknownCollection = pi.GetValue (obj, null);
            if (unknownCollection.GetType ().IsArray) {
                object [] collectionAsArray = unknownCollection as Array [];
                obj = collectionAsArray [collectionElementIndex];
            } else {
                System.Collections.IList collectionAsList = unknownCollection as System.Collections.IList;
                if (collectionAsList != null) {
                    obj = collectionAsList [collectionElementIndex];
                } else {
                }
            }
        }
    }
    return obj;
}



 

public static object GetPropertyValue (object src, string name) {
    if (src == null || string.IsNullOrWhiteSpace(name))
        return null;
    IEnumerable<string> pNames = name.Split ('.');
    foreach (string pName in pNames) {
        if(pName.Contains ("[")){
            string itemKey = pName.Trim().Substring(0, pName.IndexOf('['));
            object collection = src.GetType().GetProperty(itemKey).GetValue(src, null);
            if (null != collection) {
                int index = int.Parse(pName.Trim().Substring(itemKey.Length + 1, pName.Length - (itemKey.Length + 2)));
                if (collection is Array colArray)
                    src = colArray.GetValue(index);
                else if (collection is System.Collections.IList colList)
                    src = colList[index];
                else
                    continue;
            } else 
                return null;
        } else {
            src = src.GetType().GetProperty(pName.Trim())?.GetValue(src, null) ?? null;
        }
        if(src == null)
            return null;
    }
    return src;
}


