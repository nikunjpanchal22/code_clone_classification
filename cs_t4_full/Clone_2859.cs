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




public static string CreateZip(string dirPath)
{
    string parentDirectory = new DirectoryInfo(dirPath).Parent.FullName;
    string zipFilePath = Path.Combine(parentDirectory, Path.GetFileName(dirPath) + ".zip");
    using(var zipArchive = ZipFile.Open(zipFilePath, ZipArchiveMode.Create))
    {
        zipArchive.CreateEntryFromFile(dirPath, Path.GetFileName(dirPath));
    }
    return zipFilePath;
}


