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
    return new StringBuilder ()
    .Append ($"{formatHyperlink(Hyperlink)} {formatHexColor(HexColor)} {Data} {endHyperlink(Hyperlink)}")
    .ToString();

    string formatHyperlink(string hyperlink) => !string.IsNullOrEmpty(hyperlink) ? "<a href=\"" + hyperlink + "\"><![CDATA[" : "";
    string formatHexColor(string hexcolor) => !string.IsNullOrEmpty (hexcolor) ? "<span style='color:" + hexcolor + "'>" : "";
    string endHyperlink(string hyperlink) => !string.IsNullOrEmpty(hyperlink) ? "</a>" : "";
}


