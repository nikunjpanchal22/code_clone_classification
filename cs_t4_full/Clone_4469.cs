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


 public static void Rename (this FileSystemInfo item, string newName) {
    if (item == null)
        throw new ArgumentNullException ("item");
    var directoryInfo = item as DirectoryInfo;
    var fileInfo = item as FileInfo;
    if (directoryInfo != null)
        directoryInfo.Rename (newName);
    else if (fileInfo != null)
        fileInfo.Rename (newName);
    else
        throw new ArgumentException ("Item", "Unexpected subclass of FileSystemInfo " + item.GetType ());
}


