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
    if (!Uri.IsWellFormedUriString(path))
    {
        return false;
    }

    try 
    {
        using (SPSite site = new SPSite (path))
        {
            return true;
        }
    }
    catch (FileNotFoundException e)
    {
        return false;
    }
}


