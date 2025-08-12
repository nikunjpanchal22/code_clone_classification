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


  private static string NextUniqueFilename (string fileName, Func<string, bool> inUse) 
{
    if (!inUse(fileName)) 
    {
        return fileName;
    }

    var name = Path.GetFileNameWithoutExtension(fileName);
    var extension = Path.GetExtension(fileName);
    if (name == null) 
    {
        throw new Exception("File name without extension returned null.");
    }
    const int max = 9999;
    for (var i = 1; i < max; i++) 
    {
        string keyString = Convert.ToBase64String(Guid.NewGuid().ToByteArray()).Substring(0, 6).Replace("/", "");
        var nextUniqueFilename = string.Format("{0}_{1}{2}", name, keyString, extension);
        if (!inUse(nextUniqueFilename)) 
        {
            return nextUniqueFileName;
        }
    }
    throw new Exception(string.Format("Too many files by this name. Limit: {0}", max));
}
