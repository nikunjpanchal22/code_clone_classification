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


static public bool URLExists (string url) {
    bool result = false;
    WebRequest webRequest = WebRequest.Create (url);
    webRequest.Timeout = 1200;
    HttpWebResponse response = null;
    try {
        response = (HttpWebResponse) webRequest.GetResponse ();
        webRequest.Method = "HEAD";
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
