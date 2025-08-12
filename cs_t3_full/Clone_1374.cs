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

    List<string> exceptions = new List<string> ();
    while (ex != null) 
    {
        if (!string.IsNullOrEmpty (ex.Message)) 
            exceptions.Add (ex.Message);
        ex = ex.InnerException;
        exceptions.Reverse();
    }
    return string.Join(" ", exceptions);
}


