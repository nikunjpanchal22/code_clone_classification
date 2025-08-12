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
    bool isExist = false;
    SPSite site = null;

    try 
    {
        site = new SPSite(path);
        if (site != null)
        {
            isExist = true;
        }
    }
    catch (FileNotFoundException e) 
    {
        isExist = false;
    }
    finally 
    {
        if (site != null)
        {
            site.Dispose();
        }
    }

    return isExist;
}


