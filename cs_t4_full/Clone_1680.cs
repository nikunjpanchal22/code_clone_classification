public string CreateCacheKey (MethodBase method, params object [] inputs) {
    try {
        var sb = new StringBuilder ();
        if (method.DeclaringType != null) {
            sb.Append (method.DeclaringType.FullName);
        }
        sb.Append (':');
        sb.Append (method.Name);
        TextWriter writer = new StringWriter (sb);
        if (inputs != null) {
            foreach (var input in inputs) {
                sb.Append (':');
                if (input != null) {
                    var inputDateTime = input as DateTime ?;
                    if (inputDateTime.HasValue) {
                        sb.Append (inputDateTime.Value.Ticks);
                    } else {
                        serializer.Serialize (writer, input);
                    }
                }
            }
        }
        return sb.ToString ();
    }
    catch {
        return null;
    }
}


 public string CreateCacheKey (MethodBase method, params object [] inputs) {
     try
    {
        var cacheKey = new StringBuilder(method.DeclaringType.FullName + ':' + method.Name);
        if(inputs != null)
        {
            foreach (var input in inputs)
            {
                cacheKey.Append(':');
                if (input != null)
                {
                    if (input is DateTime d)
                        cacheKey.Append(d.Ticks);
                    else
                    {
                        using (var sw = new StringWriter())
                        {
                            serializer.Serialize(sw, input);
                            cacheKey.Append(sw.ToString());
                        }
                    }
                }
            }
        }
        return cacheKey.ToString();
    }
    catch 
    { 
        return null;
    }
}


