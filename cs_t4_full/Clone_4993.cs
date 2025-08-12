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
        StringBuilder builder = new StringBuilder();
        foreach(char c in s)
        {
            int num = c;
            if( num > 127)
            {
                builder.Append("&#" + num + ";");
            }
            else
            {
                builder.Append(c);
            }
        }
        return builder.ToString();
    }

 public static string HtmlEncode(string s) 
{
    char[] chars = s.ToCharArray();
    StringBuilder result = new StringBuilder(s.Length + (int)(s.Length * 0.1));

    foreach (char c in chars) 
    {
        int value = Convert.ToInt32(c);
        if (value > 127)
            result.AppendFormat("&#{0};", value);
        else
            result.Append(c);
    }

    return result.ToString();
}


