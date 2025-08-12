public static string Format (this TimeSpan obj) {
    StringBuilder sb = new StringBuilder ();
    if (obj.Hours != 0) {
        sb.Append (obj.Hours);
        sb.Append (" ");
        sb.Append ("hours");
        sb.Append (" ");
    }
    if (obj.Minutes != 0 || sb.Length != 0) {
        sb.Append (obj.Minutes);
        sb.Append (" ");
        sb.Append ("minutes");
        sb.Append (" ");
    }
    if (obj.Seconds != 0 || sb.Length != 0) {
        sb.Append (obj.Seconds);
        sb.Append (" ");
        sb.Append ("seconds");
        sb.Append (" ");
    }
    if (obj.Milliseconds != 0 || sb.Length != 0) {
        sb.Append (obj.Milliseconds);
        sb.Append (" ");
        sb.Append ("Milliseconds");
        sb.Append (" ");
    }
    if (sb.Length == 0) {
        sb.Append (0);
        sb.Append (" ");
        sb.Append ("Milliseconds");
    }
    return sb.ToString ();
}


 public static string Format (this TimeSpan obj) 
{ 
    StringBuilder sb = new StringBuilder (); 
    int hour = Math.Abs(obj.Hours); 
    if (hour > 0) 
    {
        sb.Append (hour);
        sb.Append (obj.Hours < 0 ? " negative-hrs" : " hrs");
        sb.Append (" "); 
    }
    int minutes = Math.Abs(obj.Minutes);
    if (minutes > 0 || sb.Length != 0) 
    {
        sb.Append (minutes);
        sb.Append (obj.Minutes < 0 ? " negative-mins" : " mins");
        sb.Append (" "); 
    } 
    int seconds = Math.Abs(obj.Seconds);
    if (seconds > 0 || sb.Length != 0)
    {
        sb.Append (seconds);
        sb.Append (obj.Seconds < 0 ? " negative-secs" : " secs");
        sb.Append (" ");
    }
    int milliseconds = Math.Abs(obj.Milliseconds);
    if (milliseconds > 0 || sb.Length != 0) 
    {
        sb.Append (milliseconds);
        sb.Append (obj.Milliseconds < 0 ? " negative-msecs" : " msecs");
        sb.Append (" ");
    }
    if (sb.Length == 0) 
    {
        sb.Append (0);
        sb.Append (" ");
        sb.Append ("msecs");
    }
    return sb.ToString ();
}


