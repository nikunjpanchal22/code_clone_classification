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
    string googleRecaptchaUrl = "https://www.google.com/recaptcha/api/siteverify";
    string postData = String.Format("secret={0}&response={1}&remoteip={2}", SecretKey, recaptchaResponse, GetClientIp());

    byte[] byteArray = Encoding.ASCII.GetBytes(postData);
    HttpWebRequest request = (HttpWebRequest)WebRequest.Create(googleRecaptchaUrl);
    request.Method = "POST";
    request.ContentType = "application/x-www-form-urlencoded";
    request.ContentLength = byteArray.Length;

    using (Stream dataStream = request.GetRequestStream())
        dataStream.Write(byteArray, 0, byteArray.Length);

    using (HttpWebResponse response = (HttpWebResponse)await request.GetResponseAsync())
    using (StreamReader reader = new StreamReader(response.GetResponseStream()))
    {
        JavaScriptSerializer js = new JavaScriptSerializer();
        result = js.Deserialize<RecaptchaValidationResult>(reader.ReadToEnd().Replace("error-codes", "ErrorMessages").Replace("success", "Succeeded"));
    }
    return result;
}


