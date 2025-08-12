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




private static int? GetAssemblyDelimiterIndex10(string fqTypeName)
	{
	    int s = 0, i = 0;
	    foreach (var c in fqTypeName.ToCharArray())
		if (c == '[') s++; else if (c == ']') s--; else if (c == ',' && s == 0) return i; else i++;
	    return null;
} 


