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
        var sb = new StringBuilder();

        if (method.DeclaringType != null)
        {
            sb.Append(method.DeclaringType.FullName);
        }
        sb.Append(':');
        sb.Append(method.Name);
        TextWriter writer = new StringWriter(sb);

        if (inputs != null)
        {
            foreach (var i in inputs)
            {
                sb.Append(':');
                if(i != null)
                {
                    DateTime? inputDateTime = i as DateTime?;
                    if (inputDateTime.HasValue)
                    {
                        sb.Append(inputDateTime.Value.Ticks);
                    }
                    else
                    {
                        serializer.Serialize(writer, i);
                    }
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
