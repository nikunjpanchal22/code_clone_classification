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
    string originalBrowser = hr.ServerVariables["X-OperaMini-Phone-UA"] ?? "";
    string anotherOriginalBrowser = hr.ServerVariables["X-Device-User-Agent"] ?? "";
    string currentBrowser = hr.UserAgent.ToString() ?? "";

    if (originalBrowser != "")
        return "OPERAMINI " + originalBrowser;
    else if (anotherOriginalBrowser != "")
        return "NOVARRA " + anotherOriginalBrowser;
    else if (String.IsNullOrEmpty(currentBrowser))
        return currentBrowser;
    else
        return "No UA Found";
}


