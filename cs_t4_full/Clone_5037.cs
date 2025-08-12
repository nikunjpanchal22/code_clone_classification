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
    int scope = 0;
    
    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        if (fullyQualifiedTypeName[i] == ',' && scope == 0)
            return i;
        else if (fullyQualifiedTypeName[i] == '[')
            scope += 1;
        else if (fullyQualifiedTypeName[i] == ']')
            scope -= 1;
    }
    return null;
}


