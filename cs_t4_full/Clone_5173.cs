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
        switch (args[i])
        { 
            case string s when File.Exists(s):
                ProcessFile(s);
                break;
            case string dir when Directory.Exists(dir): 
                ProcessDirectory(dir); 
                break;
            default: 
                Console.WriteLine($"{args[i]} is not a valid file or directory.");  
                break;
        } 
    }
}


