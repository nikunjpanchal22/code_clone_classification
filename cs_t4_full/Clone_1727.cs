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


 public static string Format(this TimeSpan obj)
    {
        var strBuilder = new StringBuilder();
        if (obj.Hours != 0)
            strBuilder.Append($"{obj.Hours} hours ");
        if (obj.Minutes != 0 || strBuilder.Length > 0)
            strBuilder.Append($"{obj.Minutes} minutes ");
        if (obj.Seconds != 0 || strBuilder.Length > 0)
            strBuilder.Append($"{obj.Seconds} seconds ");
        if (obj.Milliseconds != 0 || strBuilder.Length > 0)
            strBuilder.Append($"{obj.Milliseconds} milliseconds ");
        if (strBuilder.Length == 0)
            strBuilder.Append("0 milliseconds");
        return strBuilder.ToString();
}


