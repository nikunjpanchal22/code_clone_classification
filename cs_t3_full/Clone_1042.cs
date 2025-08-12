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
    var outputString = new StringBuilder();
    foreach (var currentField in fields)
        outputString.Append($"{currentField}{delim}");
    outputString.AppendLine();
    foreach (var currentRow in rows)
    {
        foreach (var currentField in fields)
            outputString.Append(MakeValueCsvFriendly(currentRow[currentField]))
                        .Append(delim);
        outputString.AppendLine();
    }
    return outputString.ToString();
}


