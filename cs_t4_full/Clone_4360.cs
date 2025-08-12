public static void WriteMessage (string message) {
    var path = @"../../sth.txt";
    if (File.Exists (path)) {
        string [] lines = File.ReadAllLines (path);
        using (var writer = new StreamWriter (path, true))
        {
            if (lines.Length > 0) {
                writer.WriteLine ("Another Line Added - " + message);
            } else {
                writer.WriteLine (message);
            }
            writer.Flush ();
        }} else {
        using (StreamWriter writer = new StreamWriter (path))
        {
            writer.WriteLine (message);
            writer.Flush ();
        }}
}


 public static void WriteMessage (string message) {
    string path = @"..\..\sth.txt";
    if (!File.Exists (path)) {
        File.Create (path);
    }
    using (var writer = File.AppendText (path))
    {
        writer.WriteLine ("Another Line Added - " + message);
        writer.Flush ();
    }   
 }


