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
        int counter = 0;
        using (var reader = File.OpenText(file_path)) {
            string line;
            while ((line = reader.ReadLine()) != null) {
                counter++;
                Console.WriteLine($"{counter} {line}");
            }
        }
        return true;
    }
    return false;
}


