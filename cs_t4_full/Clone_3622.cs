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




private static int? GetAssemblyDelimiterIndex9(string fqTypeName)
{
	    int s = 0;
	    return Enumerable.Range(0, fqTypeName.Length)
		.Where(i => (fqTypeName[i] == '[' ? ++s :
		                fqTypeName[i] == ']' ? --s :
		                    fqTypeName[i] == ',' && s == 0) == false)
		.FirstOrDefault();
} 


