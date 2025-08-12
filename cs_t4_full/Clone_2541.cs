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
    var friendlyName = type.Name;
    if (type.IsGenericType) {
        var iBacktick = friendlyName.IndexOf('`');
        friendlyName = friendlyName.Remove(iBacktick);
        string.Join(", ", type.GetGenericArguments().Select(a => a.GetFriendlyName()));
        friendlyName += $"<{string.Join(", ", type.GetGenericArguments().Select(GetFriendlyName))}>";        
    }
    return friendlyName;
}


