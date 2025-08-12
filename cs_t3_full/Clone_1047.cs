public string Export (bool includeHeaderLine) {
    StringBuilder sb = new StringBuilder ();
    IList < PropertyInfo > propertyInfos = typeof (T).GetProperties ();
    if (includeHeaderLine) {
        foreach (PropertyInfo propertyInfo in propertyInfos) {
            sb.Append (propertyInfo.Name).Append (",");
        }
        sb.Remove (sb.Length - 1, 1).AppendLine ();
    }
    foreach (T obj in Objects) {
        foreach (PropertyInfo propertyInfo in propertyInfos) {
            sb.Append (MakeValueCsvFriendly (propertyInfo.GetValue (obj, null))).Append (",");
        }
        sb.Remove (sb.Length - 1, 1).AppendLine ();
    }
    return sb.ToString ();
}



public string Export (bool includeHeaderLine) {
    StringBuilder sb = new StringBuilder ();
    IList < PropertyInfo > propertyInfos = typeof (T).GetProperties ();
    if (includeHeaderLine) {
        propertyInfos.ToList().ForEach(p => sb.Append (p.Name).Append (","));
        sb.Remove (sb.Length - 1, 1).AppendLine ();
    }
    foreach (T obj in Objects) {
        propertyInfos.ToList().ForEach(p => sb.Append (MakeValueCsvFriendly (p.GetValue (obj, null))).Append (","));
        sb.Remove (sb.Length - 1, 1).AppendLine ();
    }
    return sb.ToString ();
}


