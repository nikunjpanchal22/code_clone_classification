public string Export () {
    StringBuilder sb = new StringBuilder ();
    foreach (string field in fields)
        sb.Append (field).Append (delim);
    sb.AppendLine ();
    foreach (Dictionary < string, object > row in rows) {
        foreach (string field in fields)
            sb.Append (MakeValueCsvFriendly (row [field])).Append (delim);
        sb.AppendLine ();
    }
    return sb.ToString ();
}


 public string Export()
{
    var stringBuilder = new StringBuilder();
    foreach (var field in fields)
        stringBuilder.Append($"{field}{delim}");
    stringBuilder.AppendLine();
    foreach (var row in rows)
    {
        foreach (var field in fields)
            stringBuilder.Append(MakeValueCsvFriendly(row[field]))
                          .Append(delim);
        stringBuilder.AppendLine();
    }
    return stringBuilder.ToString();
}


