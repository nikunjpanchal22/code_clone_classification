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
    try 
    {
        if(hr.ServerVariables["X-OperaMini-Phone-UA"] is string originalBrowser && !string.IsNullOrEmpty(originalBrowser))
            return "OPERAMINI " + originalBrowser;
        if(hr.ServerVariables["X-Device-User-Agent"] is string anotherBrowser && !string.IsNullOrEmpty(anotherBrowser))
            return "NOVARRA " + anotherBrowser;
        return hr.UserAgent.ToString();
    }
    catch 
    {
        return "No UA Found";
    }
}


