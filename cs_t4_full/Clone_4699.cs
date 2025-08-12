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
    HttpCookieCollection myCookieColl = HttpContext.Current.Request.Cookies;
    HttpCookie myCookie = myCookieColl[strCookieName];

    if (myCookie == null) {
        myCookieColl = HttpContext.Current.Response.Cookies;
        myCookie = myCookieColl[strCookieName];
    }

    if (myCookie == null)
        return null;

    return myCookie.Value;
}


