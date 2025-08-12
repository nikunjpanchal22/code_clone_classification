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
    if (!String.IsNullOrEmpty(strCookieName))
    {
        foreach (var cookie in HttpContext.Current.Response.Cookies)
        {
            if (cookie.Name.Equals(strCookieName))
            {
                return HttpContext.Current.Response.Cookies[cookie.Name].Value;
            }
        }
        foreach (var cookie in HttpContext.Current.Request.Cookies)
        {
            if (cookie.Name.Equals(strCookieName))
            {
                return HttpContext.Current.Request.Cookies[cookie.Name].Value;
            }
        }
    }
    return null;
}


