public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    string CF_CONNECTING_IP = Request.Headers["CF-CONNECTING-IP"];
    string HTTP_X_FORWARDED_FOR = Request.ServerVariables["HTTP_X_FORWARDED_FOR"];
    string ip = string.Empty;
    if (!string.IsNullOrWhiteSpace(CF_CONNECTING_IP))
        ip = CF_CONNECTING_IP;
    else if (!string.IsNullOrWhiteSpace(HTTP_X_FORWARDED_FOR))
        ip = HTTP_X_FORWARDED_FOR;
    else
        ip = Request.UserHostAddress;
    return ip;
} 


