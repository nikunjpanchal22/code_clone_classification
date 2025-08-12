static void DeleteEmptyDirs (string dir) {
    if (String.IsNullOrEmpty (dir))
        throw new ArgumentException ("Starting directory is a null reference or an empty string", "dir");
    try {
        foreach (var d in Directory.EnumerateDirectories (dir)) {
            DeleteEmptyDirs (d);
        }
        var entries = Directory.EnumerateFileSystemEntries (dir);
        if (! entries.Any ()) {
            try {
                Directory.Delete (dir);
            }
            catch (UnauthorizedAccessException) {
            }
            catch (DirectoryNotFoundException) {
            }
        }
    }
    catch (UnauthorizedAccessException) {
    }
}


 static void DeleteEmptyDirs (string dir)  
{ 
    if (String.IsNullOrEmpty (dir)) 
        throw new ArgumentException ("Starting directory is a null reference or an empty string", "dir"); 
 
    int dirCount = Directory.GetDirectories(dir).Length; 
    int fileCount = Directory.GetFiles(dir).Length; 
   
    if (dirCount == 0 && fileCount == 0)  
    { 
        try 
        { 
            Directory.Delete (dir); 
        } 
        catch (UnauthorizedAccessException) 
        { 
        } 
        catch (DirectoryNotFoundException) 
        { 
        } 
    }  
    else 
    { 
        foreach (string d in Directory.GetDirectories(dir))  
        { 
            DeleteEmptyDirs(d); 
        } 
    } 
} 


