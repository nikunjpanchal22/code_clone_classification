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




public static bool init_access (string file_path) {
    if (File.Exists (file_path)) {
        var lines = File.ReadAllLines(file_path);
        int index = 1;
        lines.ToList().ForEach(line => Console.WriteLine((index++) + " " + line));
        return true;
    }
    return false;
}


