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
    if(hr is null)
        return "No UA Found";

    return
        !String.IsNullOrEmpty(hr.ServerVariables["X-OperaMini-Phone-UA"]) ? "OPERAMINI " + hr.ServerVariables["X-OperaMini-Phone-UA"] :
        (!String.IsNullOrEmpty(hr.ServerVariables["X-Device-User-Agent"])) ? "NOVARRA " + hr.ServerVariables["X-Device-User-Agent"] :
        (!String.IsNullOrEmpty(hr.UserAgent)) ? hr.UserAgent.ToString() :
        "No UA Found";
}


