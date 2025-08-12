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
    int delimiterIndex = -1;
    int scope = 0;

    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        char current = fullyQualifiedTypeName[i];

        if (current == '[')
            scope++;
        else if (current == ']')
            scope--;
        else if (current == ',' && scope == 0)
        {
            delimiterIndex = i;
            break;
        }
    }

    return delimiterIndex == -1 ? (int?)null : delimiterIndex;
}


