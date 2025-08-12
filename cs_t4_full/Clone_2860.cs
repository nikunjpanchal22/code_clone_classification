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
    var parentFolder = new DirectoryInfo(dirPath).Parent.FullName;
    var zipFilePath = $"{parentFolder}\\{new DirectoryInfo(dirPath).Name}.zip";
    ZipFile.CreateFromDirectory(dirPath, zipFilePath);
    return zipFilePath;
}


