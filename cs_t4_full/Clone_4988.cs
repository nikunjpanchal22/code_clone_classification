public static string HtmlEncode (string s) {
    s = HttpUtility.HtmlEncode (s);
    int num = IndexOfHighChar (s, 0);
    if (num == - 1)
        return s;
    int old_num = 0;
    StringBuilder sb = new StringBuilder ();
    do
        {
            sb.Append (s, old_num, num - old_num);
            sb.Append ("&#");
            sb.Append (((int) s [num]).ToString (NumberFormatInfo.InvariantInfo));
            sb.Append (';');
            old_num = num + 1;
            num = IndexOfHighChar (s, old_num);
        } while (num != - 1);
    sb.Append (s, old_num, s.Length - old_num);
    return sb.ToString ();
}


 public static string HtmlEncode(string s) {
    int pos = s.IndexOfAny(new char[]{
        '&', '\'', '\"', '<', '>'
    });
    if (pos == -1) {
        return s;
    }
    StringBuilder sb = new StringBuilder();
    int startPos = 0;
    while (pos != -1) {
        sb.Append(s.Substring(startPos, pos - startPos));
        char c = s[pos];
        if (c == '&')
            sb.Append("&amp;");
        else if (c == '\'')
            sb.Append("&#39;");
        else if (c == '\"')
            sb.Append("&quot;");
        else if (c == '<')
            sb.Append("&lt;");
        else
            sb.Append("&gt;");
        startPos = pos + 1;
        pos = s.IndexOfAny(new char[]{
            '&', '\'', '\"', '<', '>'
        }, startPos);
    }
    sb.Append(s.Substring(startPos));
    return sb.ToString();
}


