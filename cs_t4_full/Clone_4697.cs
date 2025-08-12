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
    string cookieValue = null;
    string[] collection = { "Request", "Response" };
    foreach (string type in collection)
    {
        foreach (string strCookie in HttpContext.Current[type].Cookies.AllKeys)
        {
            if (string.Compare(strCookie, strCookieName, true) == 0)
            {
                cookieValue = HttpContext.Current[type].Cookies[strCookieName].Value;
                break;
            }
        }
        if(!string.IsNullOrEmpty(cookieValue)) break;
    }
    return cookieValue;
}


