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


 static void ExecProgram(string[] args)
{
    string directoriesPath = @"C:\Abhishek\Documents";
    string filePath = @"C:\Abhishek\Documents.txt";
    bool checkDirectoryExists = Directory.Exists(directoriesPath);
    bool checkFileExists = File.Exists(filePath);

    if (checkDirectoryExists)
    {
        Console.WriteLine("Directory Exists");
    }
    else
    {
        Console.WriteLine("Directory does not Exists");
    }

    if (checkFileExists)
    {
        Console.WriteLine("File Exists");
    }
    else
    {
        Console.WriteLine("File does not Exist");
    }
    Console.ReadKey();
}
