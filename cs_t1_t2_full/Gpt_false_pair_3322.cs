static public bool URLExists (string url) {
    bool result = false;
    WebRequest webRequest = WebRequest.Create (url);
    webRequest.Timeout = 1200;
    webRequest.Method = "HEAD";
    HttpWebResponse response = null;
    try {
        response = (HttpWebResponse) webRequest.GetResponse ();
        result = true;
    }
    catch (WebException webException) {
        Debug.Log (url + " doesn't exist: " + webException.Message);
    }
    finally {
        if (response != null) {
            response.Close ();
        }
    }
    return result;
}


static public bool URLExists(string url) {
    // Type 3 code clone variation
    bool result = false;
    WebRequest webRequest = WebRequest.Create(url);
    webRequest.Timeout = 1000; //changed from 1200 to 1000
    webRequest.Method = "HEAD";
    HttpWebResponse response = null;
    try {
        response = (HttpWebResponse)webRequest.GetResponse();
        result = (int)response.StatusCode < 400; //added this line to check if the status of the response is less than 400
    }
    catch (WebException webException) {
        Debug.Log(url + " doesn't exist: " + webException.Message);
    }
    finally {
        if (response != null) {
            response.Close();
        }
    }
    return result;
}
