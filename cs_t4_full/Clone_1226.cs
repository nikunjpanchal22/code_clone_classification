public override string ToString () {
    builder.Clear ();
    builder.AppendLine ("<html>");
    builder.AppendLine ("<head></head>");
    builder.AppendLine ("<body>");
    builder.AppendLine ("<table>");
    builder.AppendLine ("<col>");
    foreach (List < HDNData > row in data) {
        builder.AppendLine ("<tr>");
        foreach (HDNData col in row) {
            builder.AppendLine ("<td>");
            builder.Append (col.ToString ());
            builder.AppendLine ("</td>");
        }
        builder.AppendLine ("</tr>");
    }
    builder.AppendLine ("</table>");
    builder.AppendLine ("</body>");
    builder.AppendLine ("</html>");
    return builder.ToString ();
}


 public override string ToString () {
    var sb = new StringBuilder();
    sb.AppendLine("<html><head></head><body><table><col>");
    foreach(var row in data)
    {
        sb.Append("<tr>");
        foreach(var col in row)
        {
            sb.AppendLine("<td>"+col.ToString()+"</td>");
        }
        sb.Append("</tr>");
    }
    sb.Append("</table></body></html>");
    return sb.ToString();
}


