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
        string [] lines = File.ReadAllLines (path);
        using (var outputFile = new StreamWriter (path, true))
        {
            if (lines.Length > 0) {
                outputFile.WriteLine ("Another Line Added - " + message);
            } else {
                outputFile.WriteLine (message);
            }
            outputFile.Flush ();
        }} else {
        using (StreamWriter outputFile = new StreamWriter (path))
        {
            outputFile.WriteLine (message);
            outputFile.Flush ();
        }}
}
