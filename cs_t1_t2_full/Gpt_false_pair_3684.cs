private static AssemblyName GetAssemblyName (string source, bool isFile) {
    AssemblyName asmName = null;
    try {
        if (isFile)
            asmName = GetAssemblyNameFromFile (source);
        else
            asmName = GetAssemblyNameFromQualifiedName (source);
    }
    catch (Exception err) {
        string ErrorFormatString = "Invalid Call to utility method 'GetAssemblyNameOrThrowException'\n" + "Arguments passed in:\n" + "=> Source:\n[{0}]\n" + "=> isFile = {1}\n" + "See inner exception(s) for more detail.";
        throw new InvalidOperationException (string.Format (ErrorFormatString, source, isFile), err);
    }
    if (asmName == null)
        throw new InvalidOperationException (asmName.Name + " Assembly Name object is null, but no other error was encountered!");
    return asmName;
}


private static AssemblyName GetAssemblyName (string source, bool isFile) {
    AssemblyName asmName = null;
    try {
        if (isFile)
            asmName = GetAssemblyNameFromFile (source);
        else
            asmName = GetAssemblyNameFromQualifiedName (source);
    }
    catch (Exception err) {
        string ErrorFormatString = "Invalid Call to utility method 'GetAssemblyNameOrThrowException'\n" + "Arguments passed in:\n" + "=> Source:\n[{0}]\n" + "=> isFile = {1}\n" + "See inner exception(s) for more detail.";
        throw new InvalidOperationException (string.Format (ErrorFormatString, source, isFile), err);
    }
    if (asmName == null)
        throw new InvalidOperationException (source + " Assembly Name object is null, but no other error was encountered!");
    return asmName;
}
