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
    string theValue = String.Empty; 
    if ((HttpContext.Current.Response.Cookies.Count > 0 && HttpContext.Current.Response.Cookies[strCookieName] != null) 
        || 
        (HttpContext.Current.Request.Cookies.Count > 0 && HttpContext.Current.Request.Cookies[strCookieName] != null)) 
    { 
        HttpCookie cookie = HttpContext.Current.Response.Cookies[strCookieName] 
                                 ?? HttpContext.Current.Request.Cookies[strCookieName]; 
        theValue = cookie.Value; 
    } 
    return theValue; 
} 


