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


 public static bool Validate(string encodedResponse)
{
    if (string.IsNullOrWhiteSpace(encodedResponse))
        return false;

    string secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty(secret))
        return false;

    string jsonStr = $"{{\"secret\": \"{secret}\", \"response\": \"{encodedResponse}\"}}";
    using (var httpClient = new HttpClient())
    {
        using (StringContent content = new StringContent(jsonStr, Encoding.UTF8, "application/json"))
        {
            var response = httpClient.PostAsync("https://www.google.com/recaptcha/api/siteverify", content).Result;
            if (!response.IsSuccessStatusCode)
                return false;
            string responseString = response.Content.ReadAsStringAsync().Result;
            JavaScriptSerializer js = new JavaScriptSerializer();
            ReCaptcha reCaptcha = js.Deserialize<ReCaptcha>(responseString);
            return reCaptcha.Success;
        }
    }
}


