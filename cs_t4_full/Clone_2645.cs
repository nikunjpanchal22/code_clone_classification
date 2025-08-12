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
    if (File.Exists(file_path)) {
        var lines = File.ReadLines(file_path).Select((s, i) => $"{i+1} {s}");
        foreach (var line in lines) {
            Console.WriteLine(line);
        }
        return true;
    }
    return false;
}


