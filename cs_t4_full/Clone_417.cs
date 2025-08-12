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


 public static string GetFriendlyName(this Type type) 
{ 
    string friendlyName = type.Name; 
    if (type.IsGenericType) 
    { 
        int iBacktick = friendlyName.IndexOf('`'); 
        if (iBacktick > 0) 
        { 
            friendlyName = friendlyName.Remove(iBacktick); 
        } 
        friendlyName += "<"; 
        IEnumerable<Type> typeParameters = type.GetGenericArguments(); 
        bool isFirstParameter = true; 
        foreach(var paramType in typeParameters) 
        { 
            if (!isFirstParameter) 
            { 
                friendlyName += ", "; 
            } 
            else 
            { 
                isFirstParameter = false; 
            } 
            string typeParamName = GetFriendlyName(paramType); 
            friendlyName += typeParamName; 
        } 
        friendlyName += "><![CDATA["; 
    } 
    return friendlyName; 
}


