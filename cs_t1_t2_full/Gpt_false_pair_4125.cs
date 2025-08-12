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


 private static int ? GetAssemblyDelimiterIndex3 (string fullyQualifiedTypeName) {
    int count = 0;
    for (int i = 0; i < fullyQualifiedTypeName.Length; i ++) {
        char temp = fullyQualifiedTypeName [i];
        switch (temp) {
            case '[' :
                count ++;
                break;
            case ']' :
                count --;
                break;
            case ',' :
                if (count == 0) {
                    return i;
                }
                break;
        }
    }
    return null;
}
