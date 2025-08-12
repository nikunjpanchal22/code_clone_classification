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


 public static string GetAllMessages (this Exception ex)
{
            if (ex == null)
                throw new ArgumentNullException ("ex");

            StringBuilder sb = new StringBuilder ();
            GetAllMessagesRecursively (ex.InnerException, sb, true);

            return sb.ToString ();
        }

        private static void GetAllMessagesRecursively (Exception ex, StringBuilder sb, bool prependSpace = false)
        {
            if (ex == null)
                return;

            GetAllMessagesRecursively (ex.InnerException, sb, true);
            if (prependSpace && !string.IsNullOrEmpty(ex.Message))
                sb.Append(' ');
            if (!string.IsNullOrEmpty (ex.Message))
                sb.Append (ex.Message);
}


