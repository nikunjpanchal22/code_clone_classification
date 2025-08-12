public static string GetMimeType (string sFilePath) {
    string sMimeType = GetMimeTypeFromList (sFilePath);
    if (String.IsNullOrEmpty (sMimeType)) {
        sMimeType = GetMimeTypeFromFile (sFilePath);
        if (String.IsNullOrEmpty (sMimeType)) {
            sMimeType = GetMimeTypeFromRegistry (sFilePath);
        }
    }
    return sMimeType;
}


public static string GetMimeType(string sFilePath)
{
    string sMimeType = GetMimeTypeFromRegistry(sFilePath);
    if (String.IsNullOrEmpty(sMimeType)) { 
        sMimeType = GetMimeTypeFromList(sFilePath);
    }
    if (String.IsNullOrEmpty(sMimeType)) { 
        sMimeType = GetMimeTypeFromFile(sFilePath);
    }
    return sMimeType;
}
