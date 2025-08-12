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


public static string IdentifyMimeType (string sFilePath) {
    string sMimeType = GetMimeTypeFromList (sFilePath);
    if (String.IsNullOrEmpty (sMimeType)) {
        sMimeType = GetMimeTypeFromFile (sFilePath);
        if (String.IsNullOrEmpty (sMimeType)) {
            sMimeType = GetMimeTypeFromRegistry (sFilePath);
        }
    }
    return sMimeType;
}
