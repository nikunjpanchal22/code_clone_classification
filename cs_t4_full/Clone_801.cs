public static void Rename (this FileSystemInfo item, string newName) {
    if (item == null) {
        throw new ArgumentNullException ("item");
    }
    FileInfo fileInfo = item as FileInfo;
    if (fileInfo != null) {
        fileInfo.Rename (newName);
        return;
    }
    DirectoryInfo directoryInfo = item as DirectoryInfo;
    if (directoryInfo != null) {
        directoryInfo.Rename (newName);
        return;
    }
    throw new ArgumentException ("Item", "Unexpected subclass of FileSystemInfo " + item.GetType ());
}


	public static void Rename(this DirectoryInfo directoryInfo, string newName)
{
	if (directoryInfo == null)
	{
		throw new ArgumentNullException("directoryInfo");
	}
	string fullPath = directoryInfo.FullName;
	string directory = Path.GetDirectoryName(fullPath);
	string newFullPath = Path.Combine(directory, newName);
	Directory.Move(fullPath, newFullPath);
}


