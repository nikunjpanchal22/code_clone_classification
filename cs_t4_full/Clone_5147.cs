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
    if (String.IsNullOrEmpty(encodedResponse)) 
        return false;
     
    string secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (String.IsNullOrEmpty(secret)) 
        return false;
     
    string urlString = string.Format ("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}", secret, encodedResponse);
    Uri address = new Uri(urlString);
 
    WebResponse response=null;
    try 
    {
        WebRequest request = WebRequest.Create(address);
        response = request.GetResponse();
        using (StreamReader reader = new StreamReader(response.GetResponseStream()))
        {
            string responseString = reader.ReadToEnd();
            JavaScriptSerializer serializer = new JavaScriptSerializer();
            ReCaptcha captcha = serializer.Deserialize<ReCaptcha>(responseString);
        
            return captcha.Success;
        }
    }
    catch (Exception) 
    {
        return false;
    }
    finally 
    {
        if (response != null) 
            response.Close();  
    }
}


