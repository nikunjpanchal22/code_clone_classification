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


 public static string GetAllMessages(this Exception ex)
{
                if(ex == null)
                    throw new ArgumentNullException("ex");

                string messages = "";
                CheckExceptionRecursively(ref ex, ref messages);
                return messages;
            }

            private static void CheckExceptionRecursively(ref Exception ex, ref string messages)
            {
                if(ex.InnerException == null)
                {
                    if(!string.IsNullOrEmpty(ex.Message))
                        messages += ex.Message + " ";
                    return;
                }
                if(!string.IsNullOrEmpty(ex.Message))
                    messages += ex.Message + " ";
                ex = ex.InnerException;
                CheckExceptionRecursively(ref ex, ref messages);
}


