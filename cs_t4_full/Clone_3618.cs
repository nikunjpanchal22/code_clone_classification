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




private static int? GetAssemblyDelimiterIndex2(IEnumerable<char> fqTypeName)
{
	    int i = 0, s = 0;
	    foreach (char c in fqTypeName)
	    {
		if (c == '[') s++;
		else if (c == ']') s--;
		else if (c == ',' && s == 0) return i;
		i++;
	    }
	    return null;
} 


