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
    SPSite currentSite = null;
    bool exists = false;

    if(Uri.IsWellFormedUriString(path, UriKind.Absolute)){
        try {
            currentSite = new SPSite(path);
            exists = true;
        }
        catch (FileNotFoundException e) {
            exists = false;
        }
        finally 
        {
            if (currentSite != null) 
            {
                currentSite.Dispose();
            }
        }
    } 
    else
    {
        exists = false;
    }

    return exists;
}


