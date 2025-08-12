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
    var path = @"../../sth.txt";
    if (File.Exists (path)) {
        string [] contents = File.ReadAllLines (path);
        using (var outputStream = new StreamWriter (path, true))
        {
            if (contents.Length > 0) {
                outputStream.WriteLine ("Another Line Added - " + message);
            } else {
                outputStream.WriteLine (message);
            }
            outputStream.Flush ();
        }} else {
        using (StreamWriter outputStream = new StreamWriter (path))
        {
            outputStream.WriteLine (message);
            outputStream.Flush ();
        }}
}
