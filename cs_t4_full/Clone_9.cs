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
    bool exists = false;

    try
    {
        using (SPSite site = new SPSite(path)) {
            exists = true;
        }
    }
    catch (FileNotFoundException e)
    {
        exists = false;
    }

    return exists;
}


