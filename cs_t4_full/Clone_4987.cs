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


 public static string HtmlEncode (string s) {
    s = HttpUtility.HtmlEncode(s);
    int startIndex = 0;
    int endIndex = 0;

    while(true) {
        endIndex = s.IndexOfAny(new char[] {
             '&', '\'', '\"', '<', '>'
        }, startIndex);

        if (endIndex == -1) {
            break;
        }

        switch (s[endIndex])
        {
            case '&': s = s.Remove(endIndex, 1).Insert(endIndex, "&amp;"); break;
            case '\'': s = s.Remove(endIndex, 1).Insert(endIndex, "&#39;"); break;
            case '\"': s = s.Remove(endIndex, 1).Insert(endIndex, "&quot;"); break;
            case '<': s = s.Remove(endIndex, 1).Insert(endIndex, "&lt;"); break;
            case '>': s = s.Remove(endIndex, 1).Insert(endIndex, "&gt;"); break;
        }
 
        startIndex = endIndex + 1;
    }

    return s;
}


