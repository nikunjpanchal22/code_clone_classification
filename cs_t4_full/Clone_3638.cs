static void Main (string [] args) {
    HttpWebRequest request;
    HttpWebResponse response = null;
    StreamReader reader;
    StringBuilder sbSource;
    string uri = "https://yoursubdomain.harvestapp.com/projects";
    string username = "youremail@somewhere.com";
    string password = "yourharvestpassword";
    string usernamePassword = username + ":" + password;
    ServicePointManager.ServerCertificateValidationCallback = Validator;
    try {
        request = WebRequest.Create (uri) as HttpWebRequest;
        request.MaximumAutomaticRedirections = 1;
        request.AllowAutoRedirect = true;
        request.Accept = "application/xml";
        request.ContentType = "application/xml";
        request.UserAgent = "harvest_api_sample.cs";
        request.Headers.Add ("Authorization", "Basic " + Convert.ToBase64String (new ASCIIEncoding ().GetBytes (usernamePassword)));
        using (response = request.GetResponse () as HttpWebResponse)
        {
            if (request.HaveResponse == true && response != null) {
                reader = new StreamReader (response.GetResponseStream (), Encoding.UTF8);
                sbSource = new StringBuilder (reader.ReadToEnd ());
                Console.WriteLine (sbSource.ToString ());
            }
        }}
    catch (WebException wex) {
        if (wex.Response != null) {
            using (HttpWebResponse errorResponse = (HttpWebResponse) wex.Response)
            {
                Console.WriteLine ("The server returned '{0}' with the status code {1} ({2:d}).", errorResponse.StatusDescription, errorResponse.StatusCode, errorResponse.StatusCode);
            }} else {
            Console.WriteLine (wex);
        }
    }
    finally {
        if (response != null) {
            response.Close ();
        }
    }
}





static void Main(string[] args)
{
	    var request = (HttpWebRequest)WebRequest.Create("https://yoursubdomain.harvestapp.com/projects");
	    var authInfo = "youremail@somewhere.com:yourharvestpassword";
	    authInfo = Convert.ToBase64String(Encoding.Default.GetBytes(authInfo));
	    request.Headers["Authorization"] = "Basic " + authInfo;
	    request.UserAgent = "harvest_api_sample.cs";
	    request.Accept = "application/xml";
	    request.ContentType = "application/xml";
	    using var webResponse = request.GetResponse();
	    using var webStream = webResponse.GetResponseStream();
	    using var reader = new StreamReader(webStream);
	    Console.WriteLine(reader.ReadToEnd());
}


