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
                        CreateZipStream(stZipPath, stDirToZip);
                        return stZipPath;
                    }
                    catch (Exception) {
                        throw;
                    }
                } 

                public static void CreateZipStream(string zipPath, string sourcePath)
                {
                using (ICSharpCode.SharpZipLib.Zip.ZipOutputStream zipStream =
                            new ICSharpCode.SharpZipLib.Zip.ZipOutputStream(File.Create(zipPath)))
                {
                    // Instanciate the Directory class to recursively get the files
                    DirectoryInfo dir = new DirectoryInfo(sourcePath);

                    // Call the RecurseZipDirectories method to get all the files inside the current directory
                    RecurseZipDirectories(dir, ref zipStream);

                    // close the Zip Output Stream   
                    zipStream.Finish();
                    zipStream.Close();
                }	
                    }

                    // Recursively get all the files and folders inside a directory
                    public static void RecurseZipDirectories(DirectoryInfo dir, ref ICSharpCode.SharpZipLib.Zip.ZipOutputStream zipStream)
                    {
                        // Go through each Directory
                        foreach (DirectoryInfo dirinfo in dir.GetDirectories())
                        {
                            // Recursive Call
                            RecurseZipDirectories(dirinfo, ref zipStream);
                        }
                            
                        // Get all the files created from the previous call of RecurseZipDirectories
                        foreach (FileInfo file in dir.GetFiles())
                        {
                            // add the file to the zip stream
                            ICSharpCode.SharpZipLib.Zip.ZipEntry zipEntry = new ICSharpCode.SharpZipLib.Zip.ZipEntry(file.Name);
                            zipStream.PutNextEntry(zipEntry);

                            // Open the file to read
                            StreamReader sr = File.OpenText(file.FullName);
                            string contents = sr.ReadToEnd();
                            
                            //write the file to the zip stream
                            byte[] byteArray = System.Text.Encoding.UTF8.GetBytes(contents);
                            zipStream.Write(byteArray, 0, byteArray.Length);
                        }
}


