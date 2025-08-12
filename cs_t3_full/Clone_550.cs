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


 public static bool init_access(string file_path)
{
    if (File.Exists(file_path))
    {
        string line;
        int lineCount = 1;

        StreamReader file = new StreamReader(file_path);   
        while ((line = file.ReadLine()) != null)
        {
            Console.WriteLine(lineCount + " " + line);
            lineCount++;
        }

        file.Close();
        return true;
    }
    return false;
}


