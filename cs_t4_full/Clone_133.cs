public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers.Any(h => h.Key.Equals("CF-CONNECTING-IP"))) {
        var header = Request.Headers.FirstOrDefault(h => h.Key.Equals("CF-CONNECTING-IP"));
        return header.Value;
    }
    if (Request.ServerVariables.Any(s => s.Key.Equals("HTTP_X_FORWARDED_FOR"))) {
        var serverVariable = Request.ServerVariables.FirstOrDefault(s => s.Key.Equals("HTTP_X_FORWARDED_FOR"));
        return serverVariable.Value;
    }
    return Request.UserHostAddress;
}


