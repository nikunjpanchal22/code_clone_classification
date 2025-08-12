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
    string originalBrowser = FindOriginalBrowser(hr, "X-OperaMini-Phone-UA");
    string anotherOriginalBrowser = FindOriginalBrowser(hr, "X-Device-User-Agent");


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


