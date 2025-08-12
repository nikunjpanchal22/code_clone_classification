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
    StringBuilder text = new StringBuilder();
    foreach (string field in fields)
        text.Append(field).Append(delim);
    text.Append('\n');
    foreach (Dictionary < string, object > row in rows)
    {
        foreach (string field in fields)
            text.Append(MakeValueCsvFriendly(row[field]))
                .Append(delim);
        text.Append('\n');
    }
    return text.ToString();
}
