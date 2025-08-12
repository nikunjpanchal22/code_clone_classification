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
    if (HttpContext.Current.Request.Cookies.Get(strCookieName) != null)
        return HttpContext.Current.Request.Cookies.Get(strCookieName).Value;
    else if (HttpContext.Current.Response.Cookies.Get(strCookieName) != null)
        return HttpContext.Current.Response.Cookies.Get(strCookieName).Value;
    else
        return null;
}


