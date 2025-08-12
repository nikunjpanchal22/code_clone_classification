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
    int oldIndex = 0;
    StringBuilder sb = new StringBuilder();
 
    do
    {
        int currentIndex = IndexOfHighChar(s, oldIndex);
        if (currentIndex == -1)
        {
            sb.Append(s.Substring(oldIndex));
            break;
        }
 
        sb.Append(s.Substring(oldIndex, currentIndex - oldIndex));
        sb.Append("&#");
        sb.Append((int)s[currentIndex]);
        sb.Append(";");
        oldIndex = currentIndex + 1;
    } while (oldIndex < s.Length);
 
    return sb.ToString();
}


