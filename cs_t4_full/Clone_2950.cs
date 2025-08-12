[Route ("Login")] public HttpResponseMessage GetLogin () {
    string scope = HttpUtility.UrlEncode ("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode ("http://YourWebsiteURL/api/Account/OAuthCallback");
    string accessType = "Either online or offline";
    string requestUri = string.Format ("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id={0}&redirect_uri={1}&scope={2}&access_type={3}&approval_prompt=auto&include_granted_scopes=true", _clientId, redirectUri, scope, accessType);
    HttpResponseMessage response = Request.CreateResponse (HttpStatusCode.MovedPermanently);
    response.Headers.Location = new Uri (requestUri);
    return response;
}





[HttpGet("Login")]
public IActionResult GetLogin()
{
    string scope = Uri.EscapeDataString("Space Seperated list of scopes");
    string redirectUri = Uri.EscapeDataString("http://YourWebsiteURL/api/Account/OAuthCallback");
    return Redirect($"https://accounts.google.com/o/oauth2/auth?response_type=code&client_id={_clientId}&redirect_uri={redirectUri}&scope={scope}&access_type=offline&approval_prompt=auto&include_granted_scopes=true");
}


