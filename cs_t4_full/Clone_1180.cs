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
            if (HttpContext.Current.Response.Cookies[strCookieName] != null) 
            { 
                    return HttpContext.Current.Response.Cookies[strCookieName].Value; 
            } 
            if (HttpContext.Current.Request.Cookies[strCookieName] != null) 
            { 
                    return HttpContext.Current.Request.Cookies[strCookieName].Value; 
            } 
            return null; 
    }

 public string ReadCookie (string strCookieName) 
    { 
        string value = null; 
        List<string> cookieNames = HttpContext.Current.Response.Cookies.AllKeys.Union(HttpContext.Current.Request.Cookies.AllKeys).ToList(); 
        if (cookieNames.Contains(strCookieName)) 
        { 
            if (HttpContext.Current.Response.Cookies[strCookieName] != null) 
            { 
                value = HttpContext.Current.Response.Cookies[strCookieName].Value; 
            } 
            if (string.IsNullOrEmpty(value) && HttpContext.Current.Request.Cookies[strCookieName] != null) 
            { 
                value = HttpContext.Current.Request.Cookies[strCookieName].Value; 
            } 
        } 
        return value; 
    }

 public string ReadCookie (string strCookieName) 
{
    bool found = false;
    string cookieValue = null;
    if (HttpContext.Current.Response.Cookies.Count > 0)
    {
        foreach (HttpCookie cookie in HttpContext.Current.Response.Cookies)
        {
            if (cookie.Name == strCookieName)
            {
                cookieValue = cookie.Value;
                found = true;
                break;
            }
        }
    }
    if (!found)
    {
        foreach (HttpCookie cookie in HttpContext.Current.Request.Cookies)
        {
            if (cookie.Name == strCookieName)
            {
                cookieValue = cookie.Value;
                break;
            }
        }
    }
    return cookieValue;
}


