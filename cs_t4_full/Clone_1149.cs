public bool UrlIsValid (string url) {
    try {
        HttpWebRequest request = HttpWebRequest.Create (url) as HttpWebRequest;
        request.Timeout = 5000;
        request.Method = "HEAD";
        using (HttpWebResponse response = request.GetResponse () as HttpWebResponse)
        {
            int statusCode = (int) response.StatusCode;
            if (statusCode >= 100 && statusCode < 400) {
                return true;
            } else if (statusCode >= 500 && statusCode <= 510) {
                Debug.WriteLine (String.Format ("The remote server has thrown an internal error. Url is not valid: {0}", url));
                return false;
            }
        }}
    catch (WebException ex) {
        if (ex.Status == WebExceptionStatus.ProtocolError) {
            return false;
        } else {
            log.Warn (String.Format ("Unhandled status [{0}] returned for url: {1}", ex.Status, url), ex);
        }
    }
    catch (Exception ex) {
        log.Error (String.Format ("Could not test url {0}.", url), ex);
    }
    return false;
}


 public bool UrlIsValid (string url) { 
    try { 
        WebRequest request = WebRequest.Create (url); 
        WebResponse response = request.GetResponse (); 
        if (((HttpWebResponse)response).StatusCode == HttpStatusCode.OK) { 
            return true; 
        }
    } catch { 
        return false; 
    }
    return false; 
}


