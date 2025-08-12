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
    // get the cookie from the request
    var fbCookie = HttpContext.Current.Request.Cookies["fbsr_" + _appId];

    // if the cookie exists
    if (fbCookie != null && fbCookie.Value != null)
    {
        // decode the cookie value
        string jsonCode = Encoding.ASCII.GetString(FromBase64ForUrlString(fbCookie.Value.Split(new char[] {'.'})[1]));

        // get the access token parameters
        var tokenParams = HttpUtility.ParseQueryString(GetAccessToken((string)JObject.Parse(jsonCode)["code"]));

        // assign it to the access token
        _accessToken = tokenParams["access_token"];
        return _accessToken;
    }

    return null;
}
