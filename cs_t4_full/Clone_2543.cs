public static string GetFriendlyName (this Type type) {
    string friendlyName = type.Name;
    if (type.IsGenericType) {
        int iBacktick = friendlyName.IndexOf ('`');
        if (iBacktick > 0) {
            friendlyName = friendlyName.Remove (iBacktick);
        }
        friendlyName += "<";
        Type [] typeParameters = type.GetGenericArguments ();
        for (int i = 0; i < typeParameters.Length; ++ i) {
            string typeParamName = GetFriendlyName (typeParameters [i]);
            friendlyName += (i == 0 ? typeParamName : "," + typeParamName);
        }
        friendlyName += "><![CDATA[";
    }
    return friendlyName;
}



public static string GetFriendlyName(this Type type) {
    if (!type.IsGenericType) 
        return type.Name;
    var iBacktick = type.Name.IndexOf('`');
    var genericTypeName = $"{type.Name.Remove(iBacktick)}<";
    var friendlyName = $"{genericTypeName}{string.Join(", ", type.GetGenericArguments().Select(GetFriendlyName))}>";
    return friendlyName;
}


