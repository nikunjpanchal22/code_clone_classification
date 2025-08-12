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
    if (string.IsNullOrEmpty(s))
        return s;

    // We don't escape non-ASCII characters, as they're already 
    // escaped by HttpUtility.HtmlEncode().
    List<char> list = new List<char>();
    for (int i = 0; i < s.Length; ++i)
    {
        char ch = s[i];
        if (ch >= 127)
            list.Add(ch);
        else
            list.Add(HttpUtility.HtmlEncode(ch));
    }
    return string.Join("", list);
}


