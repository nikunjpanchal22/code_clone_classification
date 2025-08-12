[Route ("Login")] public HttpResponseMessage GetLogin () {
    string scope = HttpUtility.UrlEncode ("Space Seperated list of scopes");
    string redirectUri = HttpUtility.UrlEncode ("http://YourWebsiteURL/api/Account/OAuthCallback");
    string accessType = "Either online or offline";
    string requestUri = string.Format ("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id={0}&redirect_uri={1}&scope={2}&access_type={3}&approval_prompt=auto&include_granted_scopes=true", _clientId, redirectUri, scope, accessType);
    HttpResponseMessage response = Request.CreateResponse (HttpStatusCode.MovedPermanently);
    response.Headers.Location = new Uri (requestUri);
    return response;
}





[HttpGet]
[Route("Login")]
public HttpResponse GetAuth()
{
    var settings = new GoogleAuthorizationCodeFlow.Initializer
    {
        ClientSecrets = new ClientSecrets
        {
            ClientId = _clientId,
            ClientSecret = _clientSecret
        },
        Scopes = new[] { "scope" },
        DataStore = new FileDataStore("Google.Apis.Auth")
    };

    var googleAuthorizationUrl = new GoogleAuthorizationCodeRequestUrl(settings)
    {
        RedirectUri = "http://YourWebsiteURL/api/Account/OAuthCallback",
        AccessType = "offline"
    }.Build();

    var response = new HttpResponse { StatusCode = HttpStatusCode.Redirect };
    response.Headers.Add("Location", googleAuthorizationUrl);

    return response;
}


