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
    {
        return false;
    }
    var lineCount = 0;
    var xDoc = XDocument.Load(file_path);
    var lines = xDoc.Descendants("line");
    foreach (var line in lines)
    { 
        var lineText = line.Value;
        Console.WriteLine(lineCount + " " + lineText);
        lineCount++;
    }
    return true;
}


