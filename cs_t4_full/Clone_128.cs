internal static string GetIPAddress (HttpRequestBase request) {
    string forwarded = request.Headers ["Forwarded"];
    if (! String.IsNullOrEmpty (forwarded)) {
        foreach (string segment in forwarded.Split (',') [0].Split (';')) {
            string [] pair = segment.Trim ().Split ('=');
            if (pair.Length == 2 && pair [0].Equals ("for", StringComparison.OrdinalIgnoreCase)) {
                string ip = pair [1].Trim ('"');
                int left = ip.IndexOf ('['), right = ip.IndexOf (']');
                if (left == 0 && right > 0) {
                    return ip.Substring (1, right - 1);
                }
                int colon = ip.IndexOf (':');
                if (colon != - 1) {
                    return ip.Substring (0, colon);
                }
                return ip;
            }
        }
    }
    string xForwardedFor = request.Headers ["X-Forwarded-For"];
    if (! String.IsNullOrEmpty (xForwardedFor)) {
        return xForwardedFor.Split (',') [0];
    }
    return request.UserHostAddress;
}


	internal static string GetIPAddress (HttpRequestBase request) {
    string ip = request.Headers["Forwarded"];
    if (! String.IsNullOrEmpty(ip))
    {
        string[] tokens = ip.Split(',');
        string[] parts = tokens[0].Split(';');
        foreach (string part in parts)
        {
            string[] pair = part.Split('=');
            if (pair.Length == 2)
            {
                if (pair[0].Equals("for", StringComparison.OrdinalIgnoreCase))
                {
                    ip = pair[1];
                    ip = ip.Trim('"');
                    int left = ip.IndexOf('[');
                    int right = ip.IndexOf(']');
                    if (left == 0 && right > 0)
                    {
                        ip = ip.Substring(1, right-1);
                        return ip;
                    }
                    int colonIndex = ip.IndexOf(':');
                    if (colonIndex > 0)
                    {
                        ip = ip.Substring(0, colonIndex);
                        return ip;
                    }
                    return ip;
                }
            }
        }
    }
    ip = request.Headers["X-Forwarded-For"];
    if (! String.IsNullOrEmpty(ip))
    {
        string[] parts = ip.Split(',');
        ip = parts[0];
        return ip;
    }
    ip = request.UserHostAddress;
    return ip;
}


