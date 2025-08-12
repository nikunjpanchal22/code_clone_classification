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


 static void Main (string[] args) {
    Array.ForEach(args, path => {
        try 
        {
            FileAttributes attr = File.GetAttributes(path);
            if ((attr & FileAttributes.Directory) == FileAttributes.Directory)
            {
                ProcessDirectory (path);
            }
            else
            {
                ProcessFile (path);
            }
        }
        catch 
        {
            Console.WriteLine ("{0} is not a valid file or directory.", path);
        }
    });
}


