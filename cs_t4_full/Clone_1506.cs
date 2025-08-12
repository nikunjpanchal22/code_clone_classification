public static string GetAllMessages (this Exception ex) {
    if (ex == null)
        throw new ArgumentNullException ("ex");
    StringBuilder sb = new StringBuilder ();
    while (ex != null) {
        if (! string.IsNullOrEmpty (ex.Message)) {
            if (sb.Length > 0)
                sb.Append (" ");
            sb.Append (ex.Message);
        }
        ex = ex.InnerException;
    }
    return sb.ToString ();
}


private static void GetAllMessagesRecursively (Exception ex, StringBuilder sb)
{
    if (! string.IsNullOrEmpty (ex.Message))
    {
        if (sb.Length > 0)
            sb.Append (" ");
        sb.Append (ex.Message);
    }
    if (ex.InnerException != null)
        GetAllMessagesRecursively (ex.InnerException, sb);
}


