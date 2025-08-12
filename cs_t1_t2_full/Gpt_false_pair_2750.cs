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


public static object GetPropertyValue(object srcobj, string propertyName) {
    if (srcobj == null)
        return null;
    object obj = srcobj;
    string[] propertyNameParts = propertyName.Split('.');
    foreach (string propertyNamePart in propertyNameParts) {
        if (obj == null)
            return null;
        if (!propertyNamePart.Contains("[")) {
            PropertyInfo pi = obj.GetType().GetProperty(propertyNamePart);
            if (pi == null)
                return null;
            obj = pi.GetValue(obj, null);
        } else {
            int indexStart = propertyNamePart.IndexOf("[") + 1;
            string collectionPropertyName = propertyNamePart.Substring(0, indexStart - 1);
            int collectionElementIndex = Int32.Parse(propertyNamePart.Substring(indexStart, propertyNamePart.Length - indexStart - 1));
            PropertyInfo pi = obj.GetType().GetProperty(collectionPropertyName);
            if (pi == null)
                return null;
            object unknownCollection = pi.GetValue(obj, null);
            if (unknownCollection.GetType().IsArray) {
                object[] collectionAsArray = unknownCollection as Array[];
                obj = collectionAsArray[collectionElementIndex];
            } else {
                System.Collections.IList collectionAsList = unknownCollection as System.Collections.IList;
                if (collectionAsList != null) {
                    obj = collectionAsList[collectionElementIndex];
                } else {
                    return null;
                }
            }
        }
    }
    return obj;
}
