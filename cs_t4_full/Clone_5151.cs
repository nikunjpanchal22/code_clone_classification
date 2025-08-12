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
    if (string.IsNullOrEmpty(encodedResponse)) 
    {
        return false;
    }

    var secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty(secret)) 
    {
        return false;
    }
    Uri uri = new Uri(string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse));

    try
    {
        HttpWebRequest httpWebRequest = (HttpWebRequest)WebRequest.Create(uri);
        
        using(HttpWebResponse webResponse = (HttpWebResponse)httpWebRequest.GetResponse())
        {
            using (StreamReader streamReader = new StreamReader(webResponse.GetResponseStream()))
            {
                string response  = streamReader.ReadToEnd();

                JavaScriptSerializer serializer = new JavaScriptSerializer();
                ReCaptcha captcha = serializer.Deserialize<ReCaptcha>(response);
                
                return captcha.Success;
            }
        }
    }
    catch (WebException ex)
    {
        return false;
    }
}


