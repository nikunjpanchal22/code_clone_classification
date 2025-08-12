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
    StringBuilder htmlBuilder = new StringBuilder ();
    htmlBuilder.Clear ();
    htmlBuilder.AppendLine ("<html>");
    htmlBuilder.AppendLine ("<head></head>");
    htmlBuilder.AppendLine ("<body>");
    htmlBuilder.AppendLine ("<table>");
    htmlBuilder.AppendLine ("<col>");
    foreach (List < HDNData > tableRow in data) {
        htmlBuilder.AppendLine ("<tr>");
        foreach (HDNData col in tableRow) {
            htmlBuilder.AppendLine ("<td>");
            htmlBuilder.Append (col.ToString ());
            htmlBuilder.AppendLine ("</td>");
        }
        htmlBuilder.AppendLine ("</tr>");
    }
    htmlBuilder.AppendLine ("</table>");
    htmlBuilder.AppendLine ("</body>");
    htmlBuilder.AppendLine ("</html>");
    return htmlBuilder.ToString ();
}
