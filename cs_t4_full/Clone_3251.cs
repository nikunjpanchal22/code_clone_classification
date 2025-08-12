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



 

public static object GetPropertyValue (object obj, string propname) {
		    if (obj == null)
			return null;
		    while (true) {
			var split = propname.Split(new [] {'.'}, 2);
			if (split.Length == 2) {
			    var next = GetValue(obj, split[0]);
			    obj = next;
			    propname = split[1];
			} else {
			    return GetValue(obj, propname);
			}
		    }
		}

		private static object GetValue(object obj, string propname)
		{
			    var index = propname.IndexOf('[');
			    if (index < 0)
				return obj.GetType().GetProperty(propname)?.GetValue(obj, null);
			    var propName = propname.Remove(index);
			    var collection = obj.GetType().GetProperty(propName)?.GetValue(obj, null);
			    var elementIndex = int.Parse(propname.Substring(index + 1, propname.Length - index - 2));
			    return GetValueWithIndex(collection, elementIndex);
			}

			private static object GetValueWithIndex(object collection, int elementIndex)
			{
			    if(collection is Array a)
				return a.GetValue(elementIndex);
			    return ((IList)collection)?[elementIndex];
}


