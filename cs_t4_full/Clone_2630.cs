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



public static bool URLExists(string url){
    try{
        var request = (HttpWebRequest)HttpWebRequest.Create(url);
        request.Method = "HEAD";
        using (var response = (HttpWebResponse)request.GetResponse()){
            return response.StatusCode == HttpStatusCode.OK;
        }
    } catch {
        return false;
    }
}


