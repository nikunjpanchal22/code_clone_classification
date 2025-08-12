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


 public string Export () {
        StringBuilder result = new StringBuilder ();
        foreach (string field in fields)
            result.Append (field).Append (delim);
        result.Append ('\n');
        foreach (Dictionary < string, object > row in rows) {
            foreach (string field in fields)
                result.Append (MakeValueCsvFriendly (row [field])).Append (delim);
            result.Append ('\n');
        }
        return result.ToString ();
    }

 public string Export () 
{
    var sb = new StringBuilder();
    foreach (var item in fields)
        sb.Append($"{item}{delim}");
    sb.AppendLine();
    foreach (var rowDict in rows) 
    {
        foreach (var propName in fields)
            sb.Append(MakeValueCsvFriendly(rowDict[propName])).Append(delim);
        sb.AppendLine();
    }
    return sb.ToString();
}
