[Route ("Login")] public HttpResponseMessage GetLogin () {
    string scope = HttpUtility.UrlEncode ("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode ("http://YourWebsiteURL/api/Account/OAuthCallback");
    string accessType = "Either online or offline";
    string requestUri = string.Format ("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id={0}&redirect_uri={1}&scope={2}&access_type={3}&approval_prompt=auto&include_granted_scopes=true", _clientId, redirectUri, scope, accessType);
    HttpResponseMessage response = Request.CreateResponse (HttpStatusCode.MovedPermanently);
    response.Headers.Location = new Uri (requestUri);
    return response;
}





[HttpGet, Route("Login")]
public IActionResult Login()
{
    string scope = HttpUtility.UrlEncode("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode("http://YourWebsiteURL/api/Account/OAuthCallback");
    var googleAuthUrl = string.Format("https://accounts.google.com/o/oauth2/auth?client_id={0}&redirect_uri={1}&response_type=code&scope={2}&access_type=offline", _clientId, redirectUri, scope);
    return Redirect(googleAuthUrl);
}


