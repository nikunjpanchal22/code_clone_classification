public static bool SiteExists (string path) {
    SPSite site;
    try {
        site = new SPSite (path);
    }
    catch (FileNotFoundException e) {
        return false;
    }
    finally {
        if (site != null)
            site.Dispose ();
    }
    return true;
}


 public static bool SiteExists (string path) {
    bool found = false;
    SPSite site = null;
    
    if (Uri.IsWellFormedUriString(path, UriKind.Absolute))
    {
        try
        {
            site = new SPSite(path);
            found = true;
        }
        catch (FileNotFoundException e)
        {
            found = false;
        }
        finally 
        {
            if (site != null)
            {
                site.Dispose();
            }
        }
    }   

    return found;
}


