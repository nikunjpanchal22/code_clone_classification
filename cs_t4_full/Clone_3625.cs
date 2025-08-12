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




private static int? GetAssemblyDelimiterIndex6(string fqTypeName)
	{
	    int s = 0;
	    return fqTypeName.ToCharArray().Select((c, index) => new { c, index }).Where(x => (x.c == '[' ? ++s : x.c == ']' ? --s : x.c == ',' && s == 0) == false)?.FirstOrDefault()?.index;
} 


