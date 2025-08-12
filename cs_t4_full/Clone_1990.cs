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
    var secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty(secret))
        return false;
    try
    {
        string url = string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse);
        using (WebClient wc = new WebClient())
        {
            string responseString = wc.DownloadString(url);
            JavaScriptSerializer js = new JavaScriptSerializer();
            ReCaptcha reCaptcha = js.Deserialize<ReCaptcha>(responseString);
            return reCaptcha.Success;
        }
    }
    catch
    {
        return false;
    }
}


