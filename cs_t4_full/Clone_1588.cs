private static string NextUniqueFilename (string fileName, Func < string, bool > inUse) {
    if (! inUse (fileName)) {
        return fileName;
    }
    var name = Path.GetFileNameWithoutExtension (fileName);
    var extension = Path.GetExtension (fileName);
    if (name == null) {
        throw new Exception ("File name without extension returned null.");
    }
    const int max = 9999;
    for (var i = 1; i < max; i ++) {
        var nextUniqueFilename = string.Format ("{0} ({1}){2}", name, i, extension);
        if (! inUse (nextUniqueFilename)) {
            return nextUniqueFilename;
        }
    }
    throw new Exception (string.Format ("Too many files by this name. Limit: {0}", max));
}



 private static string NextUniqueFilename (string fileName, Func < string, bool > inUse) {
    var i=1;
    string nextUniqueFileName = fileName;
    while (inUse (nextUniqueFileName)) {
        int extensionLocation = fileName.LastIndexOfAny(new char[] { '/', '.'});
        string newName = String.Format("{0} ({1}{2}",
                fileName.Substring(0, extensionLocation),           
                i++,
                fileName.Substring(extensionLocation, 
                fileName.Length - extensionLocation));
        // Increment after getting the new filename
        nextUniqueFileName = newName;
    }
    return nextUniqueFileName;
}


