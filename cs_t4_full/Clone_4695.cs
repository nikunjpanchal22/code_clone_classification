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
    if (string.IsNullOrEmpty(strCookieName))
        return null;

    HttpCookieCollection cookieCollection = HttpContext.Current.Request.Cookies;
    if (cookieCollection != null) {
        HttpCookie cookie = cookieCollection[strCookieName];
        if (cookie != null) 
            return cookie.Value;
    }

    cookieCollection = HttpContext.Current.Response.Cookies;
    if (cookieCollection != null) {
        HttpCookie cookie = cookieCollection[strCookieName];
        if (cookie != null) 
            return cookie.Value;
    }

    return null;
}


