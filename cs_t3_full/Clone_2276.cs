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





private static int? GetAssemblyDelimiterIndex1(char[] fqTypeName)
{
	    int s = 0;
	    foreach (var idx in Enumerable.Range(0, fqTypeName.Length))
	    {
		switch (fqTypeName[idx])
		{
		    case '[': s++; break;
		    case ']': s--; break;
		    case ',': if (s == 0) return idx; break;
		}
	    }
	    return null;
} 


