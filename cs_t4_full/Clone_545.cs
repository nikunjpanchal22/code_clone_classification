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
    int lineCounter = 0;
    using (StreamReader sr = File.OpenText(file_path)) 
    {
        string s = "";
        while ((s = sr.ReadLine()) != null) 
        {
            Console.WriteLine((++lineCounter).ToString() + " " + s);
        }
    }
    return true;
}


