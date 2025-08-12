public static string GetAbsoluteUrl (string relativeUrl) {
    if (String.IsNullOrEmpty (relativeUrl))
        return String.Empty;
    if (relativeUrl.StartsWith ("http://", StringComparison.OrdinalIgnoreCase) || relativeUrl.StartsWith ("https://", StringComparison.OrdinalIgnoreCase))
        return relativeUrl;
    if (HttpContext.Current == null)
        return relativeUrl;
    HttpContext context = HttpContext.Current;
    if (relativeUrl.StartsWith ("/"))
        relativeUrl = relativeUrl.Insert (0, "~");
    Page page = context.Handler as Page;
    if (page != null) {
        relativeUrl = page.ResolveUrl (relativeUrl);
    } else {
        if (! relativeUrl.StartsWith ("~/"))
            relativeUrl = relativeUrl.Insert (0, "~/");
        relativeUrl = VirtualPathUtility.ToAbsolute (relativeUrl);
    }
    var url = context.Request.Url;
    var port = url.Port != 80 ? (":" + url.Port) : String.Empty;
    return String.Format ("{0}://{1}{2}{3}", url.Scheme, url.Host, port, relativeUrl);
}


 public static string GetAbsoluteUrl (string relativeUrl)
{
    if (String.IsNullOrEmpty (relativeUrl))
        return String.Empty;
    if (relativeUrl.StartsWith ("http://", StringComparison.OrdinalIgnoreCase) || relativeUrl.StartsWith ("https://", StringComparison.OrdinalIgnoreCase))
        return relativeUrl;
    if (HttpContext.Current == null)
        return relativeUrl;
 
    string absoluteUrl;
    try
    {
        absoluteUrl = GetAbsoluteUrlFromVirtualPath(relativeUrl);
    }
    catch
    {
        Uri baseUri = HttpContext.Current.Request.Url;
        Uri resolvedUri = new Uri(baseUri, relativeUrl);
        absoluteUrl = resolvedUri.AbsoluteUri;
    }
 
    return absoluteUrl;
}


