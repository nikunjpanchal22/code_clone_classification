public string ReadCookie (string strCookieName) {
    foreach (string strCookie in HttpContext.Current.Response.Cookies.AllKeys) {
        if (strCookie == strCookieName) {
            return HttpContext.Current.Response.Cookies [strCookie].Value;
        }
    }
    foreach (string strCookie in HttpContext.Current.Request.Cookies.AllKeys) {
        if (strCookie == strCookieName) {
            return HttpContext.Current.Request.Cookies [strCookie].Value;
        }
    }
    return null;
}


 public string ReadCookie (string strCookieName) {
    string cookieValue = HttpContext.Current.Request.Cookies[strCookieName]?.Value;
    if (string.IsNullOrEmpty(cookieValue))
        cookieValue = HttpContext.Current.Response.Cookies[strCookieName]?.Value;
    return cookieValue;
}


