public override string ToString () {
    builder.Clear ();
    bool hasHyperlink = ! string.IsNullOrEmpty (Hyperlink);
    bool hasColor = ! string.IsNullOrEmpty (HexColor);
    if (hasHyperlink) {
        builder.Append ("<a href=\"");
        builder.Append (Hyperlink);
        builder.Append ("\"><![CDATA[");
    }
    if (hasColor) {
        builder.Append ("<span style='color:");
        builder.Append (HexColor);
        builder.Append ("'>");
    }
    builder.AppendLine (Data);
    if (hasHyperlink)
        builder.Append ("</a>");
    return builder.ToString ();
}


public override string ToString () {
    builder.Clear ();
    bool hasHyperlink = ! string.IsNullOrEmpty (Hyperlink);
    bool hasColor = ! string.IsNullOrEmpty (HexColor);
    if (hasHyperlink) {
        builder.Append ("<a href='");
        builder.Append (Hyperlink);
        builder.Append ("'>");
    }
    if (hasColor) {
        builder.Append ("<span style='color:");
        builder.Append (HexColor);
        builder.Append ("'>");
    }
    builder.Append (Data);
    if (hasHyperlink)
        builder.Append ("</a>");
    if (hasColor)
        builder.Append ("</span>");
    return builder.ToString ();
}
