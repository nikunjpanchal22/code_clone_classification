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
    SPSite site = null;
    
    try {
        site = new SPSite(path);
        
        return true;
    }
    catch (FileNotFoundException e) 
    {
        return false;
    }
    finally 
    {
        if (site != null)
        {
            site.Dispose();
        }
    }
}


