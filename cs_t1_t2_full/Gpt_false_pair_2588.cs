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


public static void WriteMessage(string message) {
    var path = @"../../sth.txt";
    if (File.Exists(path)) {
        string[] lines = File.ReadAllLines(path);
        using (StreamWriter sw = File.AppendText(path))
        {
            if (lines.Length > 0)
            {
                sw.WriteLine("Another Line Added - " + message);
            }
            else {
                sw.WriteLine(message);
            }
            sw.Flush();
        }
    }
    else
    {
        using (TextWriter sw = new StreamWriter(path))
        {
            sw.WriteLine(message);
            sw.Flush();
        }
    }
}
