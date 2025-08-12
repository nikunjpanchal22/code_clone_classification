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
    var agent = new string[] 
    {
        hr?.ServerVariables["X-OperaMini-Phone-UA"],
        hr?.ServerVariables["X-Device-User-Agent"]
    };

    if(!string.IsNullOrEmpty(agent[0]))
        return $"OPERAMINI {agent[0]}";
    if(!string.IsNullOrEmpty(agent[1]))
        return $"NOVARRA {agent[1]}";

    return hr?.UserAgent?.ToString() ?? "No UA Found";
}


