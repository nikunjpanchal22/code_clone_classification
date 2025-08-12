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
    if (string.IsNullOrEmpty (encodedResponse))
        return false;
    String secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (secret == string.Empty || secret == null) 
        return false;
 
    var url = string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse);
    HttpWebRequest webRequest = (HttpWebRequest)WebRequest.Create(url);
    webRequest.Method = "GET";
    String googleReply;
    try
    {
        //GA: Use 'using' for IDisposable stuff
        using (WebResponse webResponse = webRequest.GetResponse())
        {
            using (StreamReader responseReader = new StreamReader(webResponse.GetResponseStream())) 
            {
                googleReply = responseReader.ReadToEnd();
                responseReader.Close();
            }
            webResponse.Close();
        }
        JavaScriptSerializer serializer = new JavaScriptSerializer();
        ReCaptcha captcha = serializer.Deserialize<ReCaptcha>(googleReply);
 
        return captcha.Success;
    }
    catch(Exception)
    {
        //GA: Add some types of exceptions you are expecting
        return false;
    }

}


