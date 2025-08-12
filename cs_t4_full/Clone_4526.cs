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

		using (Zip zipStorer = new Zip ()) 
		{
			zipStorer.BeginUpdate (stZipPath);
			zipStorer.AddDirectory (stDirToZip);
			zipStorer.CommitUpdate ();
		}

        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
} 


