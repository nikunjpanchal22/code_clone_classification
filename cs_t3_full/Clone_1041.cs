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


 public string Export () 
{
    var createdString = new StringBuilder();
    foreach (var theField in fields)
        createdString.Append($"{theField}{delim}");
    createdString.AppendLine();
    foreach (var theRow in rows)
    {
        foreach (var theField in fields)
            createdString.Append(MakeValueCsvFriendly(theRow[theField]))
                         .Append(delim);
        createdString.AppendLine();
    }
    return createdString.ToString();
}


