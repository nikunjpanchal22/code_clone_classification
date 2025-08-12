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
    HttpWebRequest req = (HttpWebRequest) WebRequest.Create("https://www.google.com/recaptcha/api/siteverify?secret=" + SecretKey + "&response=" + recaptchaResponse + "&remoteip=" + GetClientIp ());
    using (WebResponse wResponse = req.GetResponse ())
    {
        using (StreamReader readStream = new StreamReader (wResponse.GetResponseStream ()))
        {
            string jsonResponse = readStream.ReadToEnd ();
            string errorCodesString = jsonResponse.Replace("error-codes", "");
            string[] errorCodes = errorCodesString.Split(" ");
            string errorMessages = "";
            foreach (string code in errorCodes)
            {
                switch (code)
                {
                    case "missing-input-response":
                        errorMessages += "The recaptcha response is missing; ";
                        break;
                    case "invalid-input-response":
                        errorMessages += "The recaptcha response is invalid; ";
                        break;
                }
            }
            JavaScriptSerializer js = new JavaScriptSerializer ();
            result = new RecaptchaValidationResult {ErrorMessages=errorMessages, Succeeded=jsonResponse.Contains("success")}; 
        }
    } 
    return result;
}


