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


  static void Main(string[] args) 
{ 
    bool isDirExists; 
    bool isFileExists; 

    string Path = @"C:\Abhishek\Documents"; 
    isDirExists = Directory.Exists(Path); 

    string filePath = @"C:\Abhishek\Documents.txt"; 
    isFileExists = File.Exists(filePath); 

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


