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
    var builedString = new StringBuilder();
    foreach (var field in fields)
        builedString.Append($"{field}{delim}");
    builedString.Append('\n');
    foreach (var row in rows)
    {
        foreach (var field in fields)
            builedString.Append(MakeValueCsvFriendly(row[field]))
                        .Append(delim);
        builedString.Append('\n');
    }
    return builedString.ToString();
}


