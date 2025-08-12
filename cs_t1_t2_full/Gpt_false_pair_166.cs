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
	// obtain the desired cookie 
    var facebookCookie = HttpContext.Current.Request.Cookies["fbsr_" + _appId];

	// if it exists
    if (facebookCookie != null && facebookCookie.Value != null) 
    {
		// decoding the cookie
        string jsoncode = System.Text.ASCIIEncoding.ASCII.GetString(FromBase64ForUrlString(facebookCookie.Value.Split(new char[] {'.'})[1]));

        // get the access token parameters
        var tokenParams = HttpUtility.ParseQueryString(GetAccessToken((string)JObject.Parse(jsoncode)["code"]));

        // assign them to the access token 
        _accessToken = tokenParams["access_token"];
        return _accessToken;
    }

	// returning null if cookie does not exist 
    return null;
}
