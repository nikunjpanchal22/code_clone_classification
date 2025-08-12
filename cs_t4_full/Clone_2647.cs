public static bool init_access (string file_path) {
    if (File.Exists (file_path)) {
        int counter = 0;
        foreach (string line in File.ReadAllLines (file_path)) {
            counter ++;
            Console.WriteLine (counter + " " + line);
        }
        return true;
    }
    return false;
}




public static bool init_access(string file_path) {
    if (new FileInfo(file_path).Exists) {
        var lines = File.ReadAllLines(file_path);
        Array.ForEach(lines, (line) => Console.WriteLine((Array.IndexOf(lines, line) + 1) + " " + line));
        return true;
     }
     return false;
 }


