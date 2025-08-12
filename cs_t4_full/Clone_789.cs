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
    try {
        if (item is FileInfo fileInfo) {
            fileInfo.Rename (newName);
        } else if (item is DirectoryInfo directoryInfo) {
            directoryInfo.Rename (newName);
        }
    } catch (ArgumentException ex) {
        throw new ArgumentException ("Unexpected subclass of FileSystemInfo " + item.GetType (), ex);
    }
}


