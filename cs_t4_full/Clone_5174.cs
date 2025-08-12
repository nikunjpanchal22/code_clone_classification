public static void Main (string [] args) {
    foreach (string path in args) {
        if (File.Exists (path)) {
            ProcessFile (path);
        } else if (Directory.Exists (path)) {
            ProcessDirectory (path);
        } else {
            Console.WriteLine ("{0} is not a valid file or directory.", path);
        }
    }
}


 public static void Main (string [] args)
{ 
    for (int i = 0; i < args.Length; i++)
    { 
        if (File.Exists(args[i])) 
        { 
            ProcessFile(args[i]); 
        } 
        else if (Directory.Exists(args[i])) 
        { 
            ProcessDirectory(args[i]); 
        } 
        else
        { 
            Console.WriteLine($"{args[i]} is not a valid file or directory."); 
        }
    }
}


