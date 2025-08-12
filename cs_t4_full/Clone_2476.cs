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
    var originalBrowser = hr?.ServerVariables["X-OperaMini-Phone-UA"];
    var alternateBrowser = hr?.ServerVariables["X-Device-User-Agent"];

    if(string.IsNullOrWhiteSpace(originalBrowser) == false)
        return $"OPERAMINI {originalBrowser}";

    if(string.IsNullOrWhiteSpace(alternateBrowser) == false)
        return $"NOVARRA {alternateBrowser}";

    return string.IsNullOrWhiteSpace(hr?.UserAgent) == false ? hr.UserAgent.ToString() : "No UA Found";
}


