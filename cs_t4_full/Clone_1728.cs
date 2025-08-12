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
        var output = new StringBuilder();
        if (obj.Hours != 0)
            output.Append($"{obj.Hours} hours ");
         if (obj.Minutes != 0 || output.Length != 0)
            output.Append($"{obj.Minutes} minutes ");
        if (obj.Seconds != 0 || output.Length != 0)
            output.Append($"{obj.Seconds} seconds ");
        if (obj.Milliseconds != 0 || output.Length != 0)
            output.Append($"{obj.Milliseconds} milliseconds ");
        if (output.Length == 0)
            output.Append("0 milliseconds");
        return output.ToString();
}


