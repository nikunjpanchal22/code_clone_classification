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

                var messages = new List<string>();
                CheckExceptionRecursively(ex, ref messages);
                return string.Join(" ", messages);
            }

            private static void CheckExceptionRecursively(Exception ex, ref List<string> messages)
            {
                if(ex.InnerException == null)
                {
                    if(!string.IsNullOrEmpty(ex.Message))
                        messages.Add(ex.Message);
                    return;
                }
                messages.Add(ex.Message);
                ex = ex.InnerException;
                CheckExceptionRecursively(ex, ref messages);
}


