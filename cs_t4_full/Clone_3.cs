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
    SPSite objSite = null;
    bool blnStatus = false;

    try
    {
        using (objSite = new SPSite(path))
        {
            if (objSite != null)
            {
                blnStatus = true;
            }
        }
    }
    catch (FileNotFoundException e)
    {
        blnStatus = false;
    }
    finally 
    {
        if (objSite != null)
        {
            objSite.Dispose();
        }
    }

    return blnStatus;
}


