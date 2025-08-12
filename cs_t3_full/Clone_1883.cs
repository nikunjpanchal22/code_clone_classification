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
    for (var i = 0; i < args.Length; i++) {
        var currentPath = args[i];
        if (File.Exists (currentPath))
        {
            ProcessFile (currentPath);
        }
        else if (Directory.Exists (currentPath))
        {
            ProcessDirectory (currentPath);
        }
        else
        {
            Console.WriteLine ("{0} is not a valid file or directory.", currentPath);
        }
    }
}


