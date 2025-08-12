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


 public static bool init_access (string file_path) 
{
    if (!File.Exists (file_path)) {
        return false;
    }
    string[] lineArray = File.ReadAllLines (file_path);
    int counter = 0;
    foreach (string line in lineArray) {
        counter ++;
        Console.WriteLine (counter + " " + line);
    }
    return true;
}


