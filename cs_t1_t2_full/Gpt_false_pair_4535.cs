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


private static string NewUniqueFilename (string fileName, Func < string, bool > alreadyUsed) {
    if (! alreadyUsed (fileName)) {
        return fileName;
    }
    var name = Path.GetFileNameWithoutExtension (fileName);
    var extension = Path.GetExtension (fileName);
    if (name == null) {
        throw new Exception ("File name without an extension returned null.");
    }
    const int maxFiles = 9999;
    for (var i = 1; i < maxFiles; i ++) {
        var newUniqueFilename = string.Format ("{0} ({1}){2}", name, i, extension);
        if (! alreadyUsed (newUniqueFilename)) {
            return newUniqueFilename;
        }
    }
    throw new Exception (string.Format ("Too many files with this name. Limit: {0}", maxFiles));
}
