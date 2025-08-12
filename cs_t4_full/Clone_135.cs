public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers.TryGetValue("CF-CONNECTING-IP", out string CF_CONNECTING_IP) && !String.IsNullOrWhiteSpace(CF_CONNECTING_IP))
        return CF_CONNECTING_IP;
    if (Request.ServerVariables.TryGetValue("HTTP_X_FORWARDED_FOR", out string HTTP_X_FORWARDED_FOR) && !String.IsNullOrWhiteSpace(HTTP_X_FORWARDED_FOR))
        return HTTP_X_FORWARDED_FOR;
    return Request.UserHostAddress;
} 


