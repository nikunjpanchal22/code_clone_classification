static void Main (string [] args) {
    string Path = @"C:\Abhishek\Documents";
    string filePath = @"C:\Abhishek\Documents.txt";
    bool isDirExists = Directory.Exists (Path);
    bool isFileExists = File.Exists (filePath);
    if (isDirExists) {
        Console.WriteLine ("Directory Exists");
    } else {
        Console.WriteLine ("Directory does not exists");
    }
    if (isFileExists) {
        Console.WriteLine ("File Exists");
    } else {
        Console.WriteLine ("File does not exists");
    }
    Console.ReadKey ();
}


 static int Main(string[] parameters)
{
    string dirPath = @"C:\Abhishek\Documents";
    string filePath = @"C:\Abhishek\Documents.txt";

    bool existanceDir = Directory.Exists(dirPath);
    bool existanceFile = File.Exists(filePath);

    if (existanceDir)
    {
        Console.WriteLine("Directory Exists");
    }
    else
    {
        Console.WriteLine("Directory does not exists");
    }

    if (existanceFile)
    {
        Console.WriteLine("File Exists");
    }
    else
    {
        Console.WriteLine("File does not exists");
    }
    Console.ReadKey();
    return 0;
}
