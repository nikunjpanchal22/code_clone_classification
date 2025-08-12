public static string GetIPAddress (this HttpRequest Request) {
    if (Request.Headers ["CF-CONNECTING-IP"] != null)
        return Request.Headers ["CF-CONNECTING-IP"].ToString ();
    if (Request.ServerVariables ["HTTP_X_FORWARDED_FOR"] != null)
        return Request.ServerVariables ["HTTP_X_FORWARDED_FOR"].ToString ();
    return Request.UserHostAddress;
}


 public static string GetIPAddress (this HttpRequest Request) {
	string ipAddress = string.Empty;
	if (Request.Headers.TryGetValue("CF-CONNECTING-IP", out string cfConnectionIP)) {
		ipAddress = cfConnectionIP;
	}
	else if (Request.ServerVariables.TryGetValue("HTTP_X_FORWARDED_FOR", out string httpXForwardedFor)) {
		ipAddress = httpXForwardedFor;
	} else {
		ipAddress = Request.UserHostAddress;
	}

	return ipAddress;
}


