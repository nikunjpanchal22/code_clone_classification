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




private static int? GetAssemblyDelimiterIndex4(string fqTypeName)
	{
	    int s = 0, i = 0;
	    return fqTypeName.Any(c => (c == '[' ? s++ : c == ']' ? s-- : c == ',' && s == 0) ? (i++, false) : (i++, true)) ? null : (int?)i;
} 


