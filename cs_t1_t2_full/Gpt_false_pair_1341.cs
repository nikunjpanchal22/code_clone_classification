[Route ("Login")] public HttpResponseMessage GetLogin () {
    string scope = HttpUtility.UrlEncode ("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode ("http://YourWebsiteURL/api/Account/OAuthCallback");
    string accessType = "Either online or offline";
    string requestUri = string.Format ("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id={0}&redirect_uri={1}&scope={2}&access_type={3}&approval_prompt=auto&include_granted_scopes=true", _clientId, redirectUri, scope, accessType);
    HttpResponseMessage response = Request.CreateResponse (HttpStatusCode.MovedPermanently);
    response.Headers.Location = new Uri (requestUri);
    return response;
}


 [Route("Login")] 
public HttpResponseMessage GetLogin() {
    string scope = HttpUtility.UrlEncode("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode("http://YourWebsiteURL/api/Account/OAuthCallback");
    string accessType = "Either online or offline";
    string requestUri = string.Format("https://accounts.google.com/o/oauth2/device/code?client_id={0}&scope={1}&access_type={2}&state=state_parameter_passthrough_value&redirect_uri={3}", _clientId, scope, accessType, redirectUri);
    HttpResponseMessage response = Request.CreateResponse (HttpStatusCode.MovedPermanently);
    response.Headers.Location = new Uri (requestUri);
    return response;
}
