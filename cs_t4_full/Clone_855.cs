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
                        string stZipPath = Path.Combine(di.Parent.FullName, di.Name + ".zip");
                        using (FileStream fileStream = new FileStream(stZipPath, FileMode.Create)){
                            using (ZipOutputStream zipOutputStream = new ZipOutputStream(fileStream)){
                                CompressRecursive(di, zipOutputStream);
                            }
                        }
                        return stZipPath;
                    }
                    catch (Exception) {
                        throw;
                    }
                }

                private static void CompressRecursive(DirectoryInfo di, ZipOutputStream zipOutputStream)
                {
                    foreach (FileInfo fi in di.GetFiles())
                    {
                        ZipEntry entry = new ZipEntry(fi.FullName);
                        entry.DateTime = fi.LastWriteTime;
                        entry.Size = fi.Length;
                        zipOutputStream.PutNextEntry(entry);
                        byte[] buffer = new byte[4096];
                        using (FileStream streamReader = fi.OpenRead())
                        {
                            StreamUtils.Copy(streamReader, zipOutputStream, buffer);
                        }
                        //wipe buffer
                        for (int i=0; i<buffer.Length; i++)
                            buffer[i] = 0;
                        zipOutputStream.CloseEntry();
                    }
                    foreach (DirectoryInfo ChildFolder in di.GetDirectories())
                    {
                        CompressRecursive(ChildFolder, zipOutputStream);
                    }
}


