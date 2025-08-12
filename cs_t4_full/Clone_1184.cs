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

      if (HttpContext.Current.Response.Cookies.Count > 0)
      {
           if (HttpContext.Current.Response.Cookies[strCookieName] != null)
           {
               result = HttpContext.Current.Response.Cookies[strCookieName].Value;
           }
      }
      else if (HttpContext.Current.Request.Cookies.Count > 0)
      {
            if (HttpContext.Current.Request.Cookies[strCookieName] != null)
            {
                  result = HttpContext.Current.Request.Cookies[strCookieName].Value;
            }
      }
       
      return result;
}


