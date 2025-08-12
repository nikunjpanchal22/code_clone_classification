public static void DeleteEmptyDirs (this DirectoryInfo dir) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs ();
    try {
        dir.Delete ();
    }
    catch (IOException) {
    }
    catch (UnauthorizedAccessException) {
    }
}


 public static void DeleteEmptyDirs (this DirectoryInfo dir)
{
    IEnumerable<DirectoryInfo> dirs = dir.EnumerateDirectories();
    foreach (DirectoryInfo d in dirs) 
    {
        d.DeleteEmptyDirs();
        if(dir.EnumerateDirectories().Count() == 0)
            dir.Delete(true);
        else 
            dir.Delete(false);
    }   
}


