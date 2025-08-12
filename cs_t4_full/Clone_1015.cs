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
    var propertyInfos = typeof (T).GetProperties ();
    if (includeHeaderLine) {
        var headerRow = propertyInfos.Aggregate("", (acc, cur) =>  $"{acc}{cur.Name},");
        sb.AppendLine(headerRow.Substring(0, headerRow.Length-1));
    }
    foreach (T obj in Objects) {
        var rowValues = propertyInfos
            .Select(p => MakeValueCsvFriendly (p.GetValue (obj, null)))
            .Aggregate("", (acc, cur) =>  $"{acc}{cur},");
        sb.AppendLine(rowValues.Substring(0, rowValues.Length-1));
    }
    return sb.ToString ();
}


