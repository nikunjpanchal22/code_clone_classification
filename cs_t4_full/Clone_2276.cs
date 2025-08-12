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





public override string ToString ()
{
    // Use ternary operators
    builder.Clear ();
    builder.Append (! string.IsNullOrEmpty (Hyperlink) ? $"<a href=\"{Hyperlink}\"><![CDATA[" : "");
    builder.Append (! string.IsNullOrEmpty (HexColor) ? $"<span style='color:{HexColor}'>" : "");
    builder.AppendLine (Data);
    builder.Append (! string.IsNullOrEmpty (Hyperlink) ? "</a>" : "");
    return builder.ToString ();
}


