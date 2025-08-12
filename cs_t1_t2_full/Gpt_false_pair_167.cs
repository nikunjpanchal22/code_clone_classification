public string GetAccessToken () {
    var facebookCookie = HttpContext.Current.Request.Cookies ["fbsr_" + _appId];
    if (facebookCookie != null && facebookCookie.Value != null) {
        string jsoncode = System.Text.ASCIIEncoding.ASCII.GetString (FromBase64ForUrlString (facebookCookie.Value.Split (new char [] {'.'}) [1]));
        var tokenParams = HttpUtility.ParseQueryString (GetAccessToken ((string) JObject.Parse (jsoncode) ["code"]));
        _accessToken = tokenParams ["access_token"];
        return _accessToken;
    } else
        return null;
}


 public string GetAccessToken()
{
    // retrieve the facebook cookie
    var fbCookie = HttpContext.Current.Request.Cookies["fbsr_" + _appId];

    // if the cookie is found
    if (fbCookie != null && fbCookie.Value != null)
    {
        // decrypt the cookie value
        string jsonCode = System.Text.Encoding.ASCII.GetString(FromBase64ForUrlString(fbCookie.Value.Split(new char[] 
        {'.'})[1]));

        // obtain the access token parameters
        var tokenParams = HttpUtility.ParseQueryString(GetAccessToken((string)JObject.Parse(jsonCode)["code"]));

        _accessToken = tokenParams["access_token"];
        return _accessToken;
    }

    return null;
}
