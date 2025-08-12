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
    Uri validationUri = new Uri("https://www.google.com/recaptcha/api/siteverify?secret=" + SecretKey + "&response=" + recaptchaResponse + "&remoteip=" + GetClientIp ());
    HttpWebRequest request = WebRequest.CreateDefault(validationUri);
    request.Timeout = 3000;
    request.Method = "POST";

    using (HttpWebResponse response = (HttpWebResponse) request.GetResponse ())
    {
        using (StreamReader sr = new StreamReader(response.GetResponseStream ()))
        {
            String jsonResponse = sr.ReadToEnd ();
            String errorCodesString = jsonResponse.Replace("error-codes", "");
            String[] errorCodes = errorCodesString.Split(" ");
            String errorMessages = "";
            foreach (String code in errorCodes)
            {
                if (code == "missing-input-response")
                    errorMessages += "The recaptcha response is missing; ";
                else if (code == "invalid-input-response")
                    errorMessages += "The recaptcha response is invalid; ";
            }
            JavaScriptSerializer js = new JavaScriptSerializer ();
            RecaptchaValidationResult result = 
                  new RecaptchaValidationResult {ErrorMessages=errorMessages, Succeeded=jsonResponse.Contains("success")}; 
            return result;
        }
    } 
}


