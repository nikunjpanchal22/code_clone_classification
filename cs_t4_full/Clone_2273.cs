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
    // Use local functions
    builder.Clear ();
    AppendHyperlink ();
    AppendColor ();
    builder.AppendLine (Data);
    AppendClosingHyperlink ();
    return builder.ToString ();

    void AppendHyperlink ()
    {
        if (string.IsNullOrEmpty (Hyperlink)) return;
        builder.Append ("<a href=\"");
        builder.Append (Hyperlink);
        builder.Append ("\"><![CDATA[");
    }

    void AppendColor ()
    {
        if (string.IsNullOrEmpty (HexColor)) return;
        builder.Append ("<span style='color:");
        builder.Append (HexColor);
        builder.Append ("'>");
    }

    void AppendClosingHyperlink ()
    {
        if (string.IsNullOrEmpty (Hyperlink)) return;
        builder.Append ("</a>");
    }
}


