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
        string stZipPath = stDirToZip + ".zip";
        using(ZipFile zip = new ZipFile(stZipPath)) {
            zip.AddDirectory(stDirToZip);
            zip.Save();
        }
        return stZipPath;
    }
    catch (Exception) {
        throw;
    }
}


