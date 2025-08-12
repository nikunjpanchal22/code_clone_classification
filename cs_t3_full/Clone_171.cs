public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers.ContainsKey("CF-CONNECTING-IP") || Request.Headers.Contains("CF-CONNECTING-IP"))
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables.ContainsKey("HTTP_X_FORWARDED_FOR") || Request.ServerVariables.Contains("HTTP_X_FORWARDED_FOR"))
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
} 


