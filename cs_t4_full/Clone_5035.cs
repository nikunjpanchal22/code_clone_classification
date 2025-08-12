private static int ? GetAssemblyDelimiterIndex (string fullyQualifiedTypeName) {
    int scope = 0;
    for (int i = 0; i < fullyQualifiedTypeName.Length; i ++) {
        char current = fullyQualifiedTypeName [i];
        switch (current) {
            case '[' :
                scope ++;
                break;
            case ']' :
                scope --;
                break;
            case ',' :
                if (scope == 0) {
                    return i;
                }
                break;
        }
    }
    return null;
}


 private static int? GetAssemblyDelimiterIndex(string fullyQualifiedTypeName)
{
    int? delimiterIdx = null;
    int scopeLevel = 0;

    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        char currentChar = fullyQualifiedTypeName[i];
        if (currentChar == '[' || currentChar == ']')
        {
            scopeLevel += currentChar == '[' ? 1 : -1;
        }
        else if (currentChar == ',' && scopeLevel == 0)
        {
            delimiterIdx = i;
            break;
        }
    }

    return delimiterIdx;
}


