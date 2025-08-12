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
    HttpCookieCollection cookieCollection = HttpContext.Current.Request.Cookies;
    foreach (string cookieName in cookieCollection) {
        if (cookieName == strCookieName) {
            return cookieCollection [strCookieName].Value;
        }
    }
    cookieCollection = HttpContext.Current.Response.Cookies;
    foreach (string cookieName in cookieCollection) {
        if (cookieName == strCookieName) {
            return cookieCollection [strCookieName].Value;
        }
    }
    return null;
}


