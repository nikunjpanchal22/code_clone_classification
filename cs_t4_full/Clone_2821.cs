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
	    Action<FileSystemInfo, string> action = (i, n) => 
	    {
		 switch (i)
		 {
		     case FileInfo fileInfo:
		         fileInfo.Rename(n);
		         break;
		     case DirectoryInfo directoryInfo:
		         directoryInfo.Rename(n);
		         break;
		     default:
		         throw new ArgumentException("Unexpected subclass of FileSystemInfo");
		 }
	    };
	    action(item, newName);
}


