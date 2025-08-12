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
        var output = new StringBuilder();
        if (method.DeclaringType != null)
        {
            output.Append(method.DeclaringType.FullName);
            output.Append(":");
        }
        output.Append(method.Name);
        TextWriter writer = new StringWriter(output);

        if (inputs != null)
        {
            foreach (var item in inputs)
            {
                output.Append(":");
                if (item != null)
                {
                    if (item is DateTime d){
                        output.Append(d.Ticks);
                    }
                    else{
                        serializer.Serialize(writer, item);
                    }
                }
            }
        }
        return output.ToString();
    }
    catch
    {
        return null;
    }
}


