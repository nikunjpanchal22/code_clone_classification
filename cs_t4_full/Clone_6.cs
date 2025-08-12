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
    bool exist = false;

    try
    {
        using (site = new SPSite(path))
        {
            exist = true;
        }
    }
    catch (FileNotFoundException e) 
    { 
        exist = false; 
    }
    finally 
    {
        if (site != null) 
        {
            site.Dispose();
        }
    }

    return exist;
}


