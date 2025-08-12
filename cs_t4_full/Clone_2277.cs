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





public override string ToString()
{
	    builder.Clear();
	    AssignHyperlink();
	    AssignColor();
	    builder.AppendLine(Data);
	    CloseHyperlink();
	    return builder.ToString();
	}

	private void AssignHyperlink()
	{
	    if (string.IsNullOrEmpty(Hyperlink)) return;
	    builder.Append("<a href=\"");
	    builder.Append(Hyperlink);
	    builder.Append("\"><![CDATA[");
	}

	private void AssignColor()
	{
	    if (string.IsNullOrEmpty(HexColor)) return;
	    builder.Append("<span style='color:");
	    builder.Append(HexColor);
	    builder.Append("'>");
	}

	private void CloseHyperlink()
	{
	    if (string.IsNullOrEmpty(Hyperlink)) return;
	    builder.Append("</a>");
}


