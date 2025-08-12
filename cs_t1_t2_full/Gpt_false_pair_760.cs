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
    if (File.Exists (file_path)) {
        int counter = 0;
        string[] fileLines = File.ReadAllLines(file_path);
        foreach (string fileLine in fileLines) {
            counter++;
            Console.WriteLine(counter + " " + fileLine);
        }         
        return true;
    }
    return false;
}
