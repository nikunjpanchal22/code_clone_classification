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
    if(!File.Exists(file_path))
        return false;

    try
    {
        using(StreamReader sr = File.OpenText(file_path))
        {
            string currentLine;
            int lineCount = 0;
            while((currentLine = sr.ReadLine()) != null)
            { 
                Console.WriteLine(string.Format("{0} {1}", ++lineCount, currentLine));
            }
        }
    }
    catch
    {
        return false;
    }
    return true;
}


