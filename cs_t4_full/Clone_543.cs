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
        using (StreamReader sr = new StreamReader(file_path)) 
        {
            int lineNumber = 0;
            string line;
            while ((line = sr.ReadLine()) != null) 
            {
                Console.WriteLine (++counter + " " + line);
            }
        }
        return true;
    }
    return false;
}


