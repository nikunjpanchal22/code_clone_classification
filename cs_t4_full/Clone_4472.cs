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
    if (item == null) {
        throw new ArgumentNullException ("item");
    }
    if (item is FileInfo) {
        (item as FileInfo).Rename (newName);
    }
    else if (item is DirectoryInfo) {
        (item as DirectoryInfo).Rename (newName);
    }
    else
        throw new ArgumentException ("Item", "Unexpected subclass of FileSystemInfo " + item.GetType ());
}


