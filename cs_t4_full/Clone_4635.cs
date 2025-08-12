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
    List<DirectoryInfo> dirs = dir.GetDirectories().ToList();
    foreach (DirectoryInfo d in dirs) 
    {
        d.DeleteEmptyDirs();
        int num = dir.GetDirectories().Length;
        if(num == 0)
            dir.Delete(true);
        else 
            dir.Delete(false);
    } 
}


