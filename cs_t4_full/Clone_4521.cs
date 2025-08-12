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


	public static string CreateZip (string stDirToZip) 
{
    try 
    {
        DirectoryInfo di = new DirectoryInfo (stDirToZip);
        string stZipPath = di.Parent.FullName + Path.DirectorySeparatorChar + di.Name + ".zip";

        var files = Directory.GetFiles(stDirToZip, "*", SearchOption.AllDirectories);
        
        using (ZipOutputStream s = new ZipOutputStream (File.Create(stZipPath)))
        {
            s.SetLevel(9);
            byte[] buffer = new byte[4096];
            foreach (string file in files)
            {
                ZipEntry entry = new ZipEntry (Path.GetFileName(file));
                entry.DateTime = DateTime.Now;
                s.PutNextEntry (entry);
                using (FileStream fs = File.OpenRead(file))
                {
                    int sourceBytes;
                    do
                    {
                        sourceBytes = fs.Read (buffer, 0, buffer.Length);
                        s.Write (buffer, 0, sourceBytes);
                    } while (sourceBytes > 0);
                }
            }
            s.Finish();
            s.Close();
        }
        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
}


