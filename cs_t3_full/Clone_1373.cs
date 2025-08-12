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
    Queue<Exception> exceptionQueue = new Queue<Exception> ();
    exceptionQueue.Enqueue (ex);

    while (exceptionQueue.Count > 0) 
    {
        Exception currentException = exceptionQueue.Dequeue ();

        if (!string.IsNullOrEmpty (currentException.Message)) 
        {
            if (sb.Length > 0) 
                sb.Append (" ");
            sb.Append (currentException.Message);
        }

        if (currentException.InnerException != null) 
            exceptionQueue.Enqueue (currentException.InnerException);
    }

    return sb.ToString ();
}


