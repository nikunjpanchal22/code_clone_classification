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
    if(String.IsNullOrEmpty(encodedResponse))
        return false;
    var secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (String.IsNullOrEmpty(secret))
        return false;
    Uri address = new Uri(string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse));

    HttpWebRequest request = WebRequest.Create(address) as HttpWebRequest;
    request.Method = "GET";
    request.ContentLength = 0;
    request.ContentType = "application/x-www-form-urlencoded";

    using (HttpWebResponse response = request.GetResponse() as HttpWebResponse)
    {
        if (response.StatusCode != HttpStatusCode.OK)
            return false;

        using (StreamReader reader = new StreamReader(response.GetResponseStream()))
        {
            JavaScriptSerializer serializer = new JavaScriptSerializer();
            ReCaptcha reCaptcha = serializer.Deserialize<ReCaptcha>(reader.ReadToEnd());
            return reCaptcha.Success;
        }
    }
}


