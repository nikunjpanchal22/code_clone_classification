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
            string originalBrowser = hr.ServerVariables["X-OperaMini-Phone-UA"];
            string anotherOriginalBrowser = hr.ServerVariables["X-Device-User-Agent"];
 
            string result = hr.UserAgent.ToString();
            if (!string.IsNullOrWhiteSpace(originalBrowser))
            {
                result = "OPERAMINI " + originalBrowser;
            }
            else if(!string.IsNullOrWhiteSpace(anotherOriginalBrowser))
            {
                result = "NOVARRA " + anotherOriginalBrowser;
            }
            return result;
        }
        catch(Exception ex)
        {
            return "No UA Found";
        }
    }

 public static string GetUa (HttpRequest hr)
{
    try
    {
        string originalBrowser = "";
        string anotherOriginalBrowser = "";
        if(hr.ServerVariables["X-OperaMini-Phone-UA"] != null)
        {
            originalBrowser = hr.ServerVariables["X-OperaMini-Phone-UA"];
        }
        if(hr.ServerVariables["X-Device-User-Agent"] != null)
        {
            anotherOriginalBrowser = hr.ServerVariables["X-Device-User-Agent"];
        }
        if(originalBrowser != "")
        {
            return "OPERAMINI " + originalBrowser;
        }
        else if(anotherOriginalBrowser != "")
        {
            return "NOVARRA " + anotherOriginalBrowser;
        }
        else
        {
            return hr.UserAgent.ToString();
        }
    }
    catch
    {
        return "No UA Found";
    }
}


