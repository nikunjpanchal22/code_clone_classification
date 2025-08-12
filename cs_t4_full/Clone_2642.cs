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
        var counter = 0;
        using (StreamReader reader = new StreamReader(file_path)) {
            while (!reader.EndOfStream) {
                counter++;
                Console.WriteLine($"{counter} {reader.ReadLine()}");
            }
        }
        return true;
    }
    return false;
}


