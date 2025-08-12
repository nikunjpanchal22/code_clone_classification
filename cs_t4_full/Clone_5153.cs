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
    if(encodedResponse == null || encodedResponse == String.Empty)
        return false;

    string secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (secret == string.Empty || secret == null) 
        return false;

    WebRequest request = WebRequest.Create(string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse));

    Stream responseStream = request.GetResponse().GetResponseStream();
    if (responseStream == null) 
        return false;
    
    StreamReader responseReader = new StreamReader(responseStream);
    string responseString = responseReader.ReadToEnd();
    
    JavaScriptSerializer serializer = new JavaScriptSerializer();
    ReCaptcha captcha = serializer.Deserialize<ReCaptcha>(responseString);

    responseReader.Close();

    return captcha.Success;
}


