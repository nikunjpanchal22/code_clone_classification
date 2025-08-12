public static string CreateZip (string stDirToZip) {
    try {
        DirectoryInfo di = new DirectoryInfo (stDirToZip);
        string stZipPath = di.Parent.FullName + "\\" + di.Name + ".zip";
        CreateZip (stZipPath, stDirToZip);
        return stZipPath;
    }
    catch (Exception) {
        throw;
    }
}



 public static string CreateZip (string stDirToZip) {
    try {
        DirectoryInfo di = new DirectoryInfo (stDirToZip);
        string stZipPath = di.Parent.FullName + "\\" + di.Name + ".zip";
        ZipFile.CreateFromDirectory(di.FullName, stZipPath);
        return stZipPath;
    }
    catch (Exception) {
        throw;
    }
}
