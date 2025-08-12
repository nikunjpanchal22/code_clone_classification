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
    if (string.IsNullOrWhiteSpace(encodedResponse))
        return false;

    HttpWebRequest request = (HttpWebRequest)WebRequest.Create("https://www.google.com/recaptcha/api/siteverify");
    request.Method = "POST";
    request.ContentType = "application/x-www-form-urlencoded";
    string secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (String.IsNullOrEmpty(secret))
        return false;

    string captchaData = string.Format("secret={0}{1}&response={2}", secret, Environment.NewLine, encodedResponse);
    ASCIIEncoding encoding = new ASCIIEncoding();
    byte[] captchaBytes = encoding.GetBytes(captchaData);

    request.ContentLength = captchaBytes.Length;
    request.GetRequestStream().Write(captchaBytes, 0, captchaBytes.Length);

    HttpWebResponse response = (HttpWebResponse)request.GetResponse();
    StreamReader reader = new StreamReader(response.GetResponseStream(), Encoding.UTF8);
    string responseString = reader.ReadToEnd();
    reader.Close();
    response.Close();

    JavaScriptSerializer js = new JavaScriptSerializer();
    ReCaptcha reCaptcha = js.Deserialize<ReCaptcha>(responseString);

    return reCaptcha.Success;
}


