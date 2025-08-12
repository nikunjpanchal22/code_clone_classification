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
    int retVal = -1;

    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        char ch = fullyQualifiedTypeName[i];
        if (ch == '[' || ch == ']' || ch == ',')
        {
            if (ch == '[')
                scope++;
            else if (ch == ']')
                scope--;
            else if (ch == ',' && scope == 0)
            {
                retVal = i;
                break;
            }
        }
    }
    
    return retVal == -1 ? (int?)null : retVal;
}


