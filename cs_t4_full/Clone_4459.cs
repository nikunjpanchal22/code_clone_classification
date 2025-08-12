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
    if (String.IsNullOrWhiteSpace(newName))
        throw new ArgumentException($"{nameof(newName)} cannot be null or whitespace", nameof(newName));
    if (item == null)
        throw new ArgumentNullException(nameof(item));
    if (item is FileInfo)
    {
       FileInfo fileInfo = (FileInfo)item;
       fileInfo.Rename(newName);
       return;
    }
    else if (item is DirectoryInfo)
    { 
       DirectoryInfo directoryInfo = (DirectoryInfo)item;
       directoryInfo.Rename(newName);
       return;
    }
  
    throw new ArgumentException($"Unexpected subclass of FileSystemInfo '{item.GetType()}'", nameof(item));
}


