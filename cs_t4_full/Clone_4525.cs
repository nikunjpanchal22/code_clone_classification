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
        using(Ionic.Zlib.GZipStream zip = new Ionic.Zlib.GZipStream(File.Create (stZipPath), Ionic.Zlib.CompressionMode.Compress, Ionic.Zlib.CompressionLevel.Default))
        {
            string[] files = Directory.GetFiles(stDirToZip, "*.*", SearchOption.AllDirectories);
            foreach(string filePath in files)
            {
                byte[] buffer = File.ReadAllBytes(filePath);
                zip.Write(buffer,0, buffer.Length);   
            }
        }
        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
} 


