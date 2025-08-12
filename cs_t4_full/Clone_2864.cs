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
    var pathToZip = Path.GetDirectoryName(path) +".zip";
    System.IO.Compression.ZipFile.CreateFromDirectory(path, pathToZip);
    return pathToZip;
}


