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


 public static string GetUa (HttpRequest hr) {
    string originalBrowser;
    if (hr.ServerVariables["X-OperaMini-Phone-UA"] != null)
        originalBrowser = hr.ServerVariables["X-OperaMini-Phone-UA"];
    else
        originalBrowser = "";
    string anotherOriginalBrowser;
    if (hr.ServerVariables["X-Device-User-Agent"] != null)
        anotherOriginalBrowser = hr.ServerVariables["X-Device-User-Agent"];
    else
        anotherOriginalBrowser = "";


    if (originalBrowser != "" && !String.IsNullOrEmpty(originalBrowser))
        return "OPERAMINI " + originalBrowser;
    else if (anotherOriginalBrowser != "" && !String.IsNullOrEmpty(anotherOriginalBrowser))
        return "NOVARRA " + anotherOriginalBrowser;
    else
        try {
            return hr.UserAgent.ToString() ?? "No UA Found";
        }
        catch {
            return "No UA Found";
        }
}


