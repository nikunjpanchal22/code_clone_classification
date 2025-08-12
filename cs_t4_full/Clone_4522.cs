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
	
		ZipArchive ziparchive = ZipFile.Open (stZipPath, ZipArchiveMode.Create);
		string[] files = Directory.GetFiles(stDirToZip, "*", SearchOption.AllDirectories);

		foreach (string file in files) 
		{
			string stPathNoRoot = file.Substring(stDirToZip.Length);
			stPathNoRoot = stPathNoRoot.Replace("\\", "/");
			ZipArchiveEntry zipEntry = ziparchive.CreateEntry(stPathNoRoot);
			using (FileStream fileStream = File.OpenRead(file))
			using (Stream zipEntryStream = zipEntry.Open())
				fileStream.CopyTo(zipEntryStream);
		}
        return stZipPath;
    }
    catch (Exception) 
    {
        throw;
    }
}


