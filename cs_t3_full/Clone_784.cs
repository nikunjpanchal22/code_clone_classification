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
                                CompressFolder(stDirToZip, stZipPath);
                                return stZipPath;
                            }
                            catch (Exception) {
                                throw;
                            }
                        }

                        private static void CompressFolder(string sDir, string zipFileName) 
                        {
                        using (ZipArchive zip = ZipFile.Open(zipFileName, ZipArchiveMode.Update))
                        {
                            foreach (string file in Directory.GetFiles(sDir))
                            {
                            zip.CreateEntryFromFile(file, Path.GetFileName(file), CompressionLevel.Fastest);
                            }
                        }
}


