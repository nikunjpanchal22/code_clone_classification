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




private static int? GetAssemblyDelimiterIndex3(string fqTypeName)
{
	    for (int i = 0, s = 0; i < fqTypeName.Length; i++)
	    {
		if (fqTypeName[i] == '[') s++;
		else if (fqTypeName[i] == ']') s--;
		else if (fqTypeName[i] == ',' && s == 0) return i;
	    }
	    return null;
} 


