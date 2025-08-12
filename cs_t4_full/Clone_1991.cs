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
    var secret = ConfigurationManager.AppSettings["Google.ReCaptcha.Secret"];
    if (string.IsNullOrEmpty(secret))
        return false;
    HttpWebRequest request = WebRequest.CreateHttp($"https://www.google.com/recaptcha/api/siteverify?secret={secret}&response={encodedResponse}");
    request.Method = "GET";

    HttpWebResponse response = (HttpWebResponse) request.GetResponse();
    StreamReader reader = new StreamReader(response.GetResponseStream(), Encoding.UTF8);
    string responseString = reader.ReadToEnd();

    reader.Close();
    response.Close();

    JavaScriptSerializer serializador = new JavaScriptSerializer();
    ReCaptcha recaptcha = serializador.Deserialize<ReCaptcha>(responseString);

    return recaptcha.Success;
}


