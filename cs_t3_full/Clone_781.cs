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
                            using (ZipArchive zipArchive = ZipFile.Open(stZipPath, ZipArchiveMode.Create)) {
                                CompressFolderContent(stDirToZip, zipArchive); // Call to a new method.
                            }
                            return stZipPath;
                        }
                        catch (Exception) {
                            throw;
                        }
                    }

                    public static void CompressFolderContent(string sDir, ZipArchive zipArchive) 
                    {
                        foreach (string file in Directory.GetFiles(sDir))
                        {
                            zipArchive.CreateEntryFromFile(file, Path.GetFileName(file), CompressionLevel.Fastest);
                        }
                    
                        foreach (string directory in Directory.GetDirectories(sDir))
                        {
                            CompressFolderContent(directory, zipArchive);
                        }
}


