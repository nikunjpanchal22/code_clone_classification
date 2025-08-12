public static bool Validate (string encodedResponse) {
    if (string.IsNullOrEmpty (encodedResponse))
        return false;
    var client = new System.Net.WebClient ();
    var secret = ConfigurationManager.AppSettings ["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty (secret))
        return false;
    var googleReply = client.DownloadString (string.Format ("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse));
    var serializer = new System.Web.Script.Serialization.JavaScriptSerializer ();
    var reCaptcha = serializer.Deserialize < ReCaptcha > (googleReply);
    return reCaptcha.Success;
}


 public static bool Validate (string encodedResponse) 
{
    if (string.IsNullOrWhiteSpace(encodedResponse))
        return false;
    var secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty(secret))
        return false;
    var responseString = "";   
    try
    {
        HttpClient client = new HttpClient();
        string uri = string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse);

        client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

        HttpResponseMessage response = client.GetAsync(uri).Result;
        if (response.IsSuccessStatusCode)
        {
            responseString = response.Content.ReadAsStringAsync().Result;
            JavaScriptSerializer js = new JavaScriptSerializer();
            ReCaptcha reCaptcha = js.Deserialize<ReCaptcha>(responseString);
            return reCaptcha.Success;    
        }
    }
    catch
    {
        return false;
    }
    return false;
}


