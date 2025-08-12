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


private static int GetAssemblyDelimiterIndex (string fullyQualifiedTypeName) {
    int i = 0;
    int scope = 0;
    
    while (i < fullyQualifiedTypeName.Length) {
        char current = fullyQualifiedTypeName [i];
        switch (current) {
            case  '[' :
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
        
        i ++;
    }
    
    return null;
}
