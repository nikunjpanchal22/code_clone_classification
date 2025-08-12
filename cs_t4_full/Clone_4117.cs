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
    string ipAddress = ""; 
    ipAddress = request.Headers["Forwarded"]; 
    if (!String.IsNullOrEmpty(ipAddress)) 
    { 
        string[] segments = ipAddress.Split(','); 
        foreach (string segment in segments) 
        { 
            if (segment.Contains("for")) 
            { 
                ipAddress = segment.Split('=')[1].Trim('"'); 
            } 
        } 
    } 
    if (string.IsNullOrEmpty(ipAddress)) 
    { 
        ipAddress = request.Headers["X-Forwarded-For"]; 
        if (!String.IsNullOrEmpty(ipAddress)) 
        { 
            ipAddress = ipAddress.Split(',')[0]; 
            int pos = ipAddress.IndexOf(':'); 
            if (pos > 0) ipAddress = ipAddress.Substring(0, pos); 
        } 
    } 
    if (string.IsNullOrEmpty(ipAddress)) 
    { 
        ipAddress = request.UserHostAddress; 
    } 
    return ipAddress; 
}


