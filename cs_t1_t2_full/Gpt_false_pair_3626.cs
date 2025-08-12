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


public string ExportTypeFour () {
    StringWriter sw = new StringWriter ();
    foreach (string field in fields)
        sw.Write (field + delim);
    sw.WriteLine ();
    foreach (Dictionary < string, object > row in rows) {
        foreach (string field in fields)
            sw.Write (MakeValueCsvFriendly (row [field]) + delim);
        sw.WriteLine ();
    }
    return sw.ToString ();
}
