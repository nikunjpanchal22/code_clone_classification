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

		ZipFile zip = new ZipFile(stZipPath);
        zip.BeginUpdate();
        zip.NameTransform = new ZipNameTransform(stDirToZip);
        zip.AddDirectory(stDirToZip);
        zip.CommitUpdate();    
        zip.Close();
        
        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
} 


