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
    string theValue = null;
    string cookieName;

    for (int i = 0; i < HttpContext.Current.Response.Cookies.Count; i++)
    {
        cookieName = HttpContext.Current.Response.Cookies[i].Name;

        if (cookieName == strCookieName)
        {
            theValue = HttpContext.Current.Response.Cookies[i].Value;
        }
    }

    if (string.IsNullOrEmpty(theValue))
    {
        for (int i = 0; i < HttpContext.Current.Request.Cookies.Count; i++)
        {
            cookieName = HttpContext.Current.Request.Cookies[i].Name;

            if (cookieName == strCookieName)
            {
                theValue = HttpContext.Current.Request.Cookies[i].Value;
            }
        }
    }

    return theValue;
}


