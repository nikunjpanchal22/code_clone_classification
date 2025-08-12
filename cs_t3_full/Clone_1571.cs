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
        StringBuilder sb = new StringBuilder();
        sb.Append(method.DeclaringType.FullName + ":");
        sb.Append(method.Name);
        foreach ( var input in inputs)
        {
            sb.Append(":");
            if(input != null)
            {
                if (input is DateTime){
                    sb.Append(((DateTime)input).Ticks);
                }
                else
                {
                    StringWriter writer = new StringWriter();
                    serializer.Serialize(writer, input);
                    sb.Append(writer.ToString());
                }
            }
        }
        return sb.ToString();
    }
    catch
    {
        return null;
    }
}


