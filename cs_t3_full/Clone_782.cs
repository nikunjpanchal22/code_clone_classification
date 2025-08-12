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
        string stZipPath = Path.Combine(Path.GetDirectoryName(stDirToZip), Path.GetFileName(stDirToZip)) + ".zip";
        using(ZipArchive zipArchive = ZipFile.Open(stZipPath, ZipArchiveMode.Create)) {
            ZipFile.CreateFromDirectory(stDirToZip, stZipPath);
        }
        return stZipPath;
    }
    catch (Exception) {
        throw;
    }
}


