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


 public static void Rename(this FileSystemInfo fileSystemInfo, string newName)
{
    if (string.IsNullOrWhiteSpace(newName))
        throw new ArgumentNullException("newName", " newName cannot be null or whitespace ");
    if (fileSystemInfo == null)
        throw new ArgumentNullException("item", "fileSystemInfo cannot be null ");
    Type type = fileSystemInfo.GetType(); 
    if (type == typeof(FileInfo))
        ((FileInfo)fileSystemInfo).Rename(newName);
    else if (type == typeof(DirectoryInfo))
        ((DirectoryInfo)fileSystemInfo).Rename(newName); 
    else 
        throw new ArgumentException("Item of unexpected type: " + type);
}


