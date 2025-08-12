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

                List<string> allMessages = new List<string> ();
                GetAllMessagesRecursively (ex, allMessages);

                return string.Join(" ", allMessages);
            }

            private static void GetAllMessagesRecursively (Exception ex, List<string> allMessages)
            {
                if (!string.IsNullOrEmpty (ex.Message)) 
                    allMessages.Add (ex.Message);

                if (ex.InnerException != null) 
                    GetAllMessagesRecursively (ex.InnerException, allMessages);
}


