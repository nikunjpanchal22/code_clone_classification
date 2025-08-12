public static string WebPageRead (string url) {
    if (String.IsNullOrEmpty (url)) {
        return null;
    }
    HttpWebRequest request = HttpWebRequest.Create (url) as HttpWebRequest;
    if (request == null) {
        return null;
    }
    request.Method = "GET";
    request.KeepAlive = false;
    request.ProtocolVersion = HttpVersion.Version10;
    using (WebResponse response = request.GetResponse ())
    {
        using (Stream stream = response.GetResponseStream ())
        {
            using (StreamReader reader = new StreamReader (stream, Encoding.UTF8))
            {
                return reader.ReadToEnd ();
            }}}}


 public static string WebPageRead (string url) {
    if (String.IsNullOrEmpty (url)) {
        return null;
    }
    WebRequest request = WebRequest.Create (url);
    if (request == null) {
        return null;
    }
    request.Method = "GET";
    request.Proxy = null;
    using (WebResponse response = request.GetResponse ())
    {
        using (Stream stream = response.GetResponseStream ())
        {
            using (StreamReader reader = new StreamReader (stream, Encoding.ASCII))
            {
                return reader.ReadToEnd ();
            }}}
}
