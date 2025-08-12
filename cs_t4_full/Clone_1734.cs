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


  public static string Format (this TimeSpan obj) {
        string output = "";
        if (obj.Hours != 0)
            output = string.Format("{0} hours", obj.Hours);
        if (obj.Minutes != 0 || output != "")
            output = string.Format("{0}{1} minutes", output == "" ? "" : output + " ", obj.Minutes);
        if (obj.Seconds != 0 || output != "")
            output = string.Format("{0}{1} seconds", output == "" ? "" : output + " ", obj.Seconds);
        if (obj.Milliseconds != 0 || output != "")
            output = string.Format("{0}{1} milliseconds", output == "" ? "" : output + " ", obj.Milliseconds);
        if (output == "")
            output = "0 milliseconds";
        return output;
}


