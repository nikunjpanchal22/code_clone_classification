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
        var lines = File.ReadLines(file_path);
        for (int i = 0; i < lines.Count(); i++) {
            Console.WriteLine($"{i+1} {lines.ElementAt(i)}");
        }
        return true;
    }
    return false;
}


