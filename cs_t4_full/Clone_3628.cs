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
    string result = String.Empty;
    Dictionary<string, int> timeParts = new Dictionary<string, int>
    {
        { "hours ", obj.Hours },
        { "minutes ", obj.Minutes },
        { "seconds ", obj.Seconds },
        { "milliseconds ", obj.Milliseconds },
    };
    foreach (var part in timeParts)
    {
        if (part.Value != 0 || result.Length != 0)
        {
            result += $"{part.Value} {part.Key}";
        }
    }
    return result.Length != 0 ? result : "0 milliseconds";  
}


