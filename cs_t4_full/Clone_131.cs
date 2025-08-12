public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
    string ipAddress = "";
    if (Request.Headers.Any(h => h.Key == "CF-CONNECTING-IP")){
        ipAddress = Request.Headers.SingleOrDefault(h => h.Key == "CF-CONNECTING-IP").Value.FirstOrDefault();
    }
    if (ipAddress == "" && Request.ServerVariables.Any(s => s.Key == "HTTP_X_FORWARDED_FOR")){
        ipAddress = Request.ServerVariables.SingleOrDefault(s => s.Key == "HTTP_X_FORWARDED_FOR").Value.FirstOrDefault();
    }
    if (ipAddress == ""){
        ipAddress = Request.UserHostAddress;
    }
    return ipAddress;
}


