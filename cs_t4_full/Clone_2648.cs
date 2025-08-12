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
        File.ReadLines(file_path).Zip(Enumerable.Range(1, Int32.MaxValue), (line, index) => $"{index} {line}")
           .ToList().ForEach(Console.WriteLine);
        return true;
    }
    return false;
}


