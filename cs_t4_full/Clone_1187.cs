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


 public string ReadCookie (string strCookieName) 
{
    if (HttpContext.Current.Request.Cookies[strCookieName] != null &&
       HttpContext.Current.Request.Cookies[strCookieName].Value != null)
    {
        return HttpContext.Current.Request.Cookies[strCookieName].Value;
    }
    if (HttpContext.Current.Response.Cookies[strCookieName] != null &&
           HttpContext.Current.Response.Cookies[strCookieName].Value != null)
    {
        return HttpContext.Current.Response.Cookies[strCookieName].Value;
    }
    return null;
}


