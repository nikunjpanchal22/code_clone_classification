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
    string zipPath = dirPath + ".zip";
    using(FileStream zipToOpen = new FileStream(zipPath, FileMode.Create))
    {
        using(ZipArchive archive = new ZipArchive(zipToOpen, ZipArchiveMode.Update))
        {
            archive.CreateEntryFromFile(dirPath, Path.GetFileName(dirPath));
        }
    }
    return zipPath;
}


