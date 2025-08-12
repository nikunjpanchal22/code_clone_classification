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
    FileInfo fileInfo = new FileInfo(file_path);
    if (fileInfo.Exists) {
        StreamReader streamReader = new StreamReader(fileInfo.FullName);
        string line;
        int counter = 0;
        while ((line = streamReader.ReadLine()) != null) {
            counter++;
            Console.WriteLine($"{counter}: {line}");
        }
        return true;
    } 
    return false;
}


