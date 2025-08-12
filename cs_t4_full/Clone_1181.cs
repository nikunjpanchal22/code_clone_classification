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
    string result = string.Empty;
    List<HttpCookie> cookieList = HttpContext.Current.Response.Cookies.AllKeys.Cast<string>().Select(str => HttpContext.Current.Response.Cookies[str]).ToList();
    if (cookieList.Any(cookie => cookie.Name.Equals(strCookieName)))
    {
        result = cookieList.First(cookie => cookie.Name.Equals(strCookieName)).Value;
    }
    else
    {
        cookieList = HttpContext.Current.Request.Cookies.AllKeys.Cast<string>().Select(str => HttpContext.Current.Request.Cookies[str]).ToList();
        if (cookieList.Any(cookie => cookie.Name.Equals(strCookieName)))
        {
            result = cookieList.First(cookie => cookie.Name.Equals(strCookieName)).Value;
        }
    }

    if (String.IsNullOrEmpty(result))
    {
        return null;
    }
    else
    {
        return result;
    }
}


