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

        using (ZipArchive pkZip = new ZipArchive(new FileStream(stZipPath, FileMode.Create), ZipArchiveMode.Create, true))
        {
            foreach (string file in Directory.GetFiles(stDirToZip)) 
            {
                string filename = Path.GetFileNameWithoutExtension(file);
                ZipArchiveEntry entry = pkZip.CreateEntry(filename);

                using (FileStream fs = File.OpenRead(file))
                using (StreamWriter writer = new StreamWriter(entry.Open()))
                    writer.Write(fs, 0, fs.Length);
            }
        };
        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
}


