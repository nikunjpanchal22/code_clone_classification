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
    s = HttpUtility.HtmlEncode(s);
    int startIndex = 0;
    StringBuilder sb = new StringBuilder();
    while (startIndex < s.Length)
    {
        int nextIndex = IndexOfHighChar(s, startIndex);
        if (nextIndex == -1)
        {
            sb.Append(s.Substring(startIndex));
            break;
        }

        sb.Append(s.Substring(startIndex, nextIndex - startIndex));
        sb.Append("&#");
        sb.Append((int)s[nextIndex]);
        sb.Append(";");
        startIndex = nextIndex + 1;
    }

    return sb.ToString();
}


