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
    if(File.Exists(file_path))
    {
        int counter = 0; 
        List<string> rawText =	File.ReadLines(file_path).ToList<string>();
       	rawText.ForEach(item => {
            counter +=  1;
            Console.WriteLine(counter + " " + item);
        });
        return true;
    }
    return false;

}


