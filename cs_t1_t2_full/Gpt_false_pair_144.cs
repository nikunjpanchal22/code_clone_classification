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


 static void MyProgram(string[] args)
{
    string directory = @"C:\Abhishek\Documents";
    string file = @"C:\Abhishek\Documents.txt";

    bool isDirExists = Directory.Exists(directory);
    bool isFileExists = File.Exists(file);

    if (isDirExists)
    {
        Console.WriteLine("Directory Exists");
    }
    else
    {
        Console.WriteLine("Directory does not exists");
    }
    if (isFileExists)
    {
        Console.WriteLine("File Exists");
    }
    else
    {
        Console.WriteLine("File does not exists");
    }
    Console.ReadKey();
}
