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
    bool isExists = false;
    SPSite site;

    if (Uri.IsWellFormedUriString (path, UriKind.Absolute)) {
        try {
            site = new SPSite(path);
            isExists = true;
        }
        catch (FileNotFoundException e) {
            isExists = false;
        }
        finally {
            if (site != null) {
                site.Dispose();
            }
        }
    }
    else {
        isExists = false;
    }
    return isExists;
}


