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




private static int? GetAssemblyDelimiterIndex8(string fqTypeName)
	{
	    int s = 0;
	    var found = fqTypeName.Select((c, i) => new { i, ok = c == '[' ? ++s : c == ']' ? --s : c == ',' ? s == 0 : true }).FirstOrDefault(x => !x.ok);
	    return found?.i;
} 


