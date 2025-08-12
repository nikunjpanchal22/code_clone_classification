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
                        ZipOutputStream zipOutStream = new ZipOutputStream(File.Create(stZipPath));
                        zipOutStream.SetLevel(3);
                        zipOutStream.UseZip64 = Zip64Option.AsNecessary;
                            
                        ZipDirectory(stDirToZip, zipOutStream, stDirToZip);   // Call to a new method.
                        zipOutStream.Close();
                        return stZipPath;

                    }
                    catch (Exception) {
                        throw;
                    }
                }

                public static void ZipDirectory(string sourceDirectory, ZipOutputStream zipOutStream, string baseDirectory)
                {
                    foreach (string dir in Directory.GetDirectories(sourceDirectory))
                    {
                        var entries = Directory.GetDirectories(dir).Where(d => !d.Contains(".ipa")) // Exclude a folder
                                        .Select(d => new {dir = d, name = d.Replace(baseDirectory, string.Empty) });
                        foreach (var en in entries)
                        {
                            ZipDirectory(en.dir, zipOutStream, baseDirectory);
                        }
                    
                        foreach (string file in Directory.GetFiles(dir))
                        {
                            byte[] byteBuffer = File.ReadAllBytes(file);
                            string fileName = file.Replace(baseDirectory, string.Empty);
                            ZipEntry entry = new ZipEntry(fileName);
                            entry.DateTime = DateTime.Now;
                            entry.Size = byteBuffer.Length;
                            zipOutStream.PutNextEntry(entry);
                            zipOutStream.Write(byteBuffer, 0, byteBuffer.Length);
                        }
                    }
}


