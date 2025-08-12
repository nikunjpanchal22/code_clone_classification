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
    var sb = new StringBuilder ();
    sb.AppendLine ("<html>");
    sb.AppendLine ("<head></head>");
    sb.AppendLine ("<body>");
    sb.AppendLine ("<table>");
    sb.AppendLine ("<col>");
    foreach (List < HDNData > row in data) {
        sb.AppendLine ("<tr>");
        foreach (HDNData col in row) {
            sb.AppendLine ("<td>");
            sb.AppendLine (col.ToString ());
            sb.AppendLine ("</td>");
        }
        sb.AppendLine ("</tr>");
    }
    sb.AppendLine ("</table>");
    sb.AppendLine ("</body>");
    sb.AppendLine ("</html>");
    return sb.ToString ();
}
