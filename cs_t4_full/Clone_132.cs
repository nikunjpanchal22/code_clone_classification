public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    string ip = string.Empty; 
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        ip = Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (string.IsNullOrWhiteSpace(ip) && Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        ip = Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    if (string.IsNullOrWhiteSpace(ip))
        ip = Request.UserHostAddress;
    return ip;
} 


