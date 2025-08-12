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


 static void MainProgram(string[] parameters)
{
    string pathDir = @"C:\Abhishek\Documents";
    string pathFile = @"C:\Abhishek\Documents.txt";

    bool checkBegin = Directory.Exists(pathDir);
    bool checkFinish = File.Exists(pathFile);

    if (checkBegin)
    {
        Console.WriteLine("Directory Exists");
    }
    else
    {
        Console.WriteLine("Directory does not exists");
    }
    if (checkFinish)
    {
        Console.WriteLine("File Exists");
    }
    else
    {
        Console.WriteLine("File does not exists");
    }
    Console.ReadKey();
}
