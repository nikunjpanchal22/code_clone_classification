public static string GetUa (HttpRequest hr) {
    try {
        string originalBrowser = hr.ServerVariables ["X-OperaMini-Phone-UA"];
        string anotherOriginalBrowser = hr.ServerVariables ["X-Device-User-Agent"];
        if (! String.IsNullOrEmpty (originalBrowser))
            return "OPERAMINI " + originalBrowser;
        else if (! String.IsNullOrEmpty (anotherOriginalBrowser))
            return "NOVARRA " + anotherOriginalBrowser;
        else
            return hr.UserAgent.ToString ();
    }
    catch {
        return "No UA Found";
    }
}





public static string GetUa(HttpRequest hr)
{
    string result = "No UA Found";

    if(hr != null)
    {
        string originalUserAgent = hr.ServerVariables["X-OperaMini-Phone-UA"];
        string anotherUserAgent = hr.ServerVariables["X-Device-User-Agent"];

        if(!string.IsNullOrEmpty(originalUserAgent))
            result = "OPERAMINI " + originalUserAgent;
        else if(!string.IsNullOrEmpty(anotherUserAgent))
            result = "NOVARRA " + anotherUserAgent;
        else
            result = hr.UserAgent.ToString();
    }

    return result;
}


