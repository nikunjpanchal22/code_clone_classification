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



public static void Rename(this FileSystemInfo item, string newName)
{
	    switch (item)
	    {
		case FileInfo fileInfo:
		    fileInfo.Rename(newName);
		    break;
		case DirectoryInfo directoryInfo:
		    directoryInfo.Rename(newName);
		    break;
		default:
		    throw new ArgumentException("Invalid type");
	    }
}


