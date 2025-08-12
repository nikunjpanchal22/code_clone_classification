public static String Combine (String path1, String path2) {
    if (path1 == null || path2 == null)
        throw new ArgumentNullException ((path1 == null) ? "path1" : "path2");
    Contract.EndContractBlock ();
    CheckInvalidPathChars (path1);
    CheckInvalidPathChars (path2);
    return CombineNoChecks (path1, path2);
}


public static String Combine (String path1, String path2) {
    if (path1 == null || path2 == null)
        throw new ArgumentNullException ((path1 == null) ? "path1" : "path2");
    Contract.Ensures (Contract.Result<String> () != null);
    CheckInvalidPathChars (path1);
    CheckInvalidPathChars (path2);
    return CombineNoChecks (path1, path2);
}
