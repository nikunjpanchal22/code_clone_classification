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
    while (ex != null) 
    {
        if (!string.IsNullOrEmpty (ex.Message)) 
            allMessages.Add (ex.Message);
        ex = ex.InnerException;
    }
    return string.Join(" ", allMessages);
}


