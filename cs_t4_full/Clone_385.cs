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


private static string FindOriginalBrowser (HttpRequest hr, string key) {
        if (hr.ServerVariables[key] != null)
            return hr.ServerVariables[key];
        else
            return "";
    }

 public static string GetUa (HttpRequest hr) {
    string operatorMiniPhoneUa = hr.ServerVariables["X-OperaMini-Phone-UA"] ?? "";
    string deviceUserAgent = hr.ServerVariables["X-Device-User-Agent"] ?? "";
    string userAgent = hr.UserAgent.ToString() ?? "No UA Found";

    if (operatorMiniPhoneUa != "")
        return "OPERAMINI " + operatorMiniPhoneUa;
    else if (deviceUserAgent != "")
        return "NOVARRA " + deviceUserAgent;
    else
        return userAgent;
}


