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


 public string ReadCookie(string strCookieName)
{
    HttpCookieCollection requestCookieCollection = HttpContext.Current.Request.Cookies;
    HttpCookieCollection responseCookieCollection = HttpContext.Current.Response.Cookies;

    if(requestCookieCollection != null && requestCookieCollection[strCookieName] != null)
    {
        return requestCookieCollection[strCookieName].Value;
    }
    else if (responseCookieCollection != null && responseCookieCollection[strCookieName] != null)
    {
        return responseCookieCollection[strCookieName].Value;
    }
    else
    {
        return null;
    }
}


