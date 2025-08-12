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


public static void Main (string [] args) {
    foreach (string path in args) {
        if (FileSystemInfo.Exists (path)) {
            if(File.Exists(path)) {
               ProcessFile (path);
            } else if (Directory.Exists (path)) {
                ProcessDirectory (path);
            } 
        } else {
            Console.WriteLine ("{0} is not a valid file or directory.", path);
        }
    }
}
