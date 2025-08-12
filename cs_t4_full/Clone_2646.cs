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
        var content = File.ReadAllText(file_path);
        content.Split('\n').Select((line, index) => Console.WriteLine((index + 1) + " " + line)).ToList();
        return true;
    }
    return false;
}


