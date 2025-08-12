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

    HttpWebRequest request = (HttpWebRequest)WebRequest.Create($"https://www.google.com/recaptcha/api/siteverify?secret={secret}&response={encodedResponse}");
    request.Method = "GET";

    using (HttpWebResponse response = (HttpWebResponse)request.GetResponse())
    {
        StreamReader streamReader = new StreamReader(response.GetResponseStream(), Encoding.UTF8);
        string responseString = streamReader.ReadToEnd();
        JavaScriptSerializer js = new JavaScriptSerializer();
        ReCaptcha reCaptcha = js.Deserialize<ReCaptcha>(responseString);
        return reCaptcha.Success;
    }
}


