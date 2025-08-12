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
    var timeComponents = new[]
    {
        obj.Hours != 0 ? $"{obj.Hours} hours " : string.Empty,
        (obj.Minutes != 0 || obj.Hours != 0) ? $"{obj.Minutes} minutes " : string.Empty,
        (obj.Seconds != 0 || obj.Hours != 0 || obj.Minutes != 0) ? $"{obj.Seconds} seconds " : string.Empty,
        (obj.Milliseconds != 0 || obj.Hours != 0 || obj.Minutes != 0 || obj.Seconds != 0) ? $"{obj.Milliseconds} milliseconds " : "0 milliseconds"
    };
    return timeComponents.Where(x => !string.IsNullOrEmpty(x)).Aggregate((current, next) => current + next);
}


