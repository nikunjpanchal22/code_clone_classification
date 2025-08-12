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
    if (!File.Exists(file_path))
    {
        return false;
    }        
    int lineCounter = 1;
    StreamReader sr = new StreamReader(file_path);
    while (sr.EndOfStream == false)
    {
        Console.WriteLine(lineCounter++ + " " + sr.ReadLine());
    }
    sr.Close();

    return true;
}


