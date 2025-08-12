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


  public static string CreateZip (string srcDir) {
    try {
        string destDir = srcDir + ".zip";
        DirectoryInfo di = new DirectoryInfo(srcDir);
        ZipFile.CreateFromDirectory(di.FullName, destDir);
        return destDir;
    }
    catch (Exception) {
        throw;
    }
}


