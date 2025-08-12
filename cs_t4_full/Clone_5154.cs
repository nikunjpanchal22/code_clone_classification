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
	{
		return false;
	}

	string secretKey = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];

	if (string.IsNullOrEmpty (secretKey)) 
	{
		return false;
	}

	var webRequest = (HttpWebRequest)WebRequest.Create(string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secretKey, encodedResponse));
	webRequest.Method = "GET";

	string googleReply = new StreamReader (webRequest.GetResponse().GetResponseStream()).ReadToEnd();

	var serializer = new System.Web.Script.Serialization.JavaScriptSerializer ();
	var reCaptcha = serializer.Deserialize<ReCaptcha> (googleReply);

	return reCaptcha.Success;
}


