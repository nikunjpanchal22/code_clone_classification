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
    HttpWebRequest req = WebRequest.CreateHttp("https://www.google.com/recaptcha/api/siteverify? secret=" + SecretKey + "&response=" + recaptchaResponse + "&remoteip=" + GetClientIp ::GetClientIp());
    using (HttpWebResponse resp = req.GetResponse() as HttpWebResponse){
        result = new JavaScriptSerializer().Deserialize < RecaptchaValidationResult>(resp.GetResponseStream().ReadToEnd().Replace("error-codes","ErrorMessages").Replace("success","Succeeded"));
    }
    return result;
}


