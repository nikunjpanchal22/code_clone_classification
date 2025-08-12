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
    HttpWebRequest req = (HttpWebRequest) WebRequest.Create ("https://www.google.com/recaptcha/api/siteverify?secret=" + SecretKey + "&response=" + recaptchaResponse + "&remoteip=" + GetClientIp ());
    using (HttpWebResponse response = (HttpWebResponse)req.GetResponse()){
        JavaScriptSerializer js = new JavaScriptSerializer();
        using (StreamReader sr = new StreamReader(response.GetResponseStream())){
            result = js.Deserialize<RecaptchaValidationResult>(sr.ReadToEnd().Replace("error-codes", "ErrorMessages").Replace("success", "Succeeded"));
        }
    }
    return result;	
}


