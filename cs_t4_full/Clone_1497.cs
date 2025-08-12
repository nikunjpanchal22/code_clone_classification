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

                var messagesBuilder = new StringBuilder();
                ParseExceptionRecursively(ex, messagesBuilder);
                return messagesBuilder.ToString();
            }

            private static void ParseExceptionRecursively(Exception ex, StringBuilder messagesBuilder)
            {
                if(ex.InnerException == null)
                {
                    if(!string.IsNullOrEmpty(ex.Message))
                        messagesBuilder.Append(ex.Message);
                    return;
                }
                messagesBuilder.Append(ex.Message);
                ParseExceptionRecursively(ex.InnerException, messagesBuilder);
}


