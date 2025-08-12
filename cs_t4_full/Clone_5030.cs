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
    for (int i = 0; i < fullyQualifiedTypeName.Length; i++)
    {
        if (fullyQualifiedTypeName[i] == ',')
        {
            int scope = 0;
            for (int j = 0; j < i; j++)
            {
                if (fullyQualifiedTypeName[j] == '[')
                    scope++;
                else if (fullyQualifiedTypeName[j] == ']')
                    scope--;

                if (scope == 0 && fullyQualifiedTypeName[j] == ',')
                    continue;
            
                if (scope == 0)
                    return i;
            }
        }
    }

    return null;
}


