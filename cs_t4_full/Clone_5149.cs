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

	string secret = ConfigurationManager.AppSettings ["Google.ReCaptcha.Secret"]; 
	if (string.IsNullOrEmpty(secret)) 
		return false;

	HttpWebRequest webRequest = (HttpWebRequest)WebRequest.Create (string.Format ("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse));
	webRequest.Method = "GET";

	string googleReply;
	try 
	{
		using (WebResponse response = webRequest.GetResponse ()) 
		{
			using (StreamReader reader = new StreamReader (response.GetResponseStream ())) 
			{
				googleReply = reader.ReadToEnd ();
				reader.Close ();
			}
			response.Close ();
		}
		JavaScriptSerializer serializer = new JavaScriptSerializer ();
		ReCaptcha captcha = serializer.Deserialize<ReCaptcha> (googleReply);
		return captcha.Success;
	} 
	catch (Exception) 
	{
		return false;
	}
}


