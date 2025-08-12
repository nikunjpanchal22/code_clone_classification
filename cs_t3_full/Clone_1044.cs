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
        StringBuilder sbHeaderLine = new StringBuilder();
        foreach (PropertyInfo propertyInfo in propertyInfos) {
            sbHeaderLine.Append (propertyInfo.Name).Append (",");
        }
        sbHeaderLine.Remove (sbHeaderLine.Length - 1, 1).AppendLine ();
        sb.Append(sbHeaderLine);
    }
    foreach (T obj in Objects) {
        StringBuilder sbContentLine = new StringBuilder();
        foreach (PropertyInfo propertyInfo in propertyInfos) {
            sbContentLine.Append (MakeValueCsvFriendly (propertyInfo.GetValue (obj, null))).Append (",");
        }
        sbContentLine.Remove (sbContentLine.Length - 1, 1).AppendLine ();
        sb.Append(sbContentLine);
    }
    return sb.ToString ();
}


