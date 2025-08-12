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




public static string CreateZip(string path)
{
    DirectoryInfo dirInfo = new DirectoryInfo(path);
    string zipFilePath = Path.Combine(dirInfo.Parent.FullName, dirInfo.Name + ".zip");
    ZipArchive.CreateEntryFromFile(zipFilePath, dirInfo.Name);
    return zipFilePath;
}


