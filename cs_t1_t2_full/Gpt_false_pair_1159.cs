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
                            DirectoryInfo di = new DirectoryInfo (stDirToZip);
                            string stZipPath = di.Parent.FullName + "\\" + di.Name + ".zip";
                            using (ZipArchive zip = ZipFile.Open(stZipPath, ZipArchiveMode.Create)){
                                CompressContent(di, zip);  // Call to a new method;
                            }
                            return stZipPath;
                        }
                        catch (Exception) {
                            throw;
                        }
                    }

                    public static void CompressContent(DirectoryInfo di, ZipArchive zip){
                        foreach (FileInfo fi in di.GetFiles()){
                            zip.CreateEntryFromFile(fi.FullName,fi.Name);
                        }
                        foreach (DirectoryInfo childDirectory in di.GetDirectories())
                        {
                            CompressContent(childDirectory, zip);
                        }
}
