public RecaptchaValidationResult Validate (string recaptchaResponse) {
    RecaptchaValidationResult result = new RecaptchaValidationResult ();
    HttpWebRequest req = (HttpWebRequest) WebRequest.Create ("https://www.google.com/recaptcha/api/siteverify?secret=" + SecretKey + "&response=" + recaptchaResponse + "&remoteip=" + GetClientIp ());
    using (WebResponse wResponse = req.GetResponse ())
    {
        using (StreamReader readStream = new StreamReader (wResponse.GetResponseStream ()))
        {
            string jsonResponse = readStream.ReadToEnd ();
            JavaScriptSerializer js = new JavaScriptSerializer ();
            result = js.Deserialize < RecaptchaValidationResult > (jsonResponse.Replace ("error-codes", "ErrorMessages").Replace ("success", "Succeeded"));
        }} return result;
}


 public RecaptchaValidationResult Validate (string recaptchaResponse) {
    RecaptchaValidationResult result = new RecaptchaValidationResult ();
    string url = string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}&remoteip={2}", SecretKey, recaptchaResponse, GetClientIp());
    HttpWebRequest request = WebRequest.Create(url) as HttpWebRequest;
    using (HttpWebResponse response = request.GetResponse() as HttpWebResponse){
        StreamReader reader = new StreamReader(response.GetResponseStream());
        string json = reader.ReadToEnd().Replace("error-codes", "ErrorMessages").Replace("success", "Succeeded");
        JavaScriptSerializer js = new JavaScriptSerializer();
        result = js.Deserialize<RecaptchaValidationResult> (json);
    }
    return result;
}


