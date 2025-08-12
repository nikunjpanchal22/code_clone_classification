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



public static string CreateZip(string directoryToZip)
{
    string zipFilePath = "";
    try
    {
        zipFilePath = Path.Combine(Directory.GetParent(directoryToZip).FullName, Path.GetFileNameWithoutExtension(directoryToZip)) + ".zip";
        ZipFile.CreateFromDirectory(directoryToZip, zipFilePath);
    }
    catch (Exception e)
    {
        Console.WriteLine("Exception: " + e.Message);
    }
    return zipFilePath;
}


