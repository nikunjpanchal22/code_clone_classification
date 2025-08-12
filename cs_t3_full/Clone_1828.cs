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
    HttpWebRequest req = (HttpWebRequest) WebRequest.Create (string.Format("https://www.google.com/recaptcha/api/siteverify?secret={0}&response={1}&remoteip={2}", SecretKey, recaptchaResponse, GetClientIp()));
    using (WebResponse response = req.GetResponse())
    using (StreamReader reader = new StreamReader(response.GetResponseStream()))
    {
        JavaScriptSerializer js = new JavaScriptSerializer();
        result = js.Deserialize<RecaptchaValidationResult> (reader.ReadToEnd().Replace("error-codes", "ErrorMessages").Replace("success", "Succeeded"));
    }
     return result;
}


