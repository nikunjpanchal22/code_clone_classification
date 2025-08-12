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
    StringBuilder sb = new StringBuilder ();
    sb.AppendLine ("<html> <head></head> <body> <table> <col>");
    foreach (List < HDNData > row in data) {
        sb.AppendLine ("<tr>");
        foreach (HDNData col in row) {
            sb.AppendFormat ("<td> {0} </td>", col.ToString ());          
        }
        sb.AppendLine ("</tr>");
    }
    sb.AppendLine ("</table> </body> </html>");
    return sb.ToString ();
}


