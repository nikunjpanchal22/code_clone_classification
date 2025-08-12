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


 public static string HtmlEncode(string s)
{
    var encodedString = HttpUtility.HtmlEncode(s);

    int charIndex = encodedString.IndexOfAny(new char[] { '&', '\'', '\"', '<', '>' });

    if (charIndex == -1)
    {
        return encodedString;
    }

    var sb = new StringBuilder();
    int startIndex = 0;

    do
    {
        sb.Append(encodedString, startIndex, charIndex - startIndex);
        char currentChar = encodedString[charIndex];

        switch (currentChar)
        {
            case '&':
                sb.Append("&amp;");
                break;
            case '\'':
                sb.Append("&#39;");
                break;
            case '\"':
                sb.Append("&quot;");
                break;
            case '<':
                sb.Append("&lt;");
                break;
            case '>':
                sb.Append("&gt;");
                break;
        }

        startIndex = charIndex + 1;
        charIndex = encodedString.IndexOfAny(new char[] { '&', '\'', '\"', '<', '>' }, startIndex);
    }
    while (charIndex >= 0);

    sb.Append(encodedString, startIndex, encodedString.Length - startIndex);
    return sb.ToString();
}


