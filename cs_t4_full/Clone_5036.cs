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


private static int? GetAssemblyDelimiterIndex (string fullyQualifiedTypeName) 
{
    int scope = 0;
    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        char currentChar = fullyQualifiedTypeName[i];
        if (currentChar == '[') 
        {
            scope ++;
        }
        else if (currentChar == ']') 
        {
            scope --;
        }
        else if (currentChar == ',' && (scope == 0)) 
        {
            return i;
        }
    }
    return null;
}


