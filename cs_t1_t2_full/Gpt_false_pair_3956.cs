private static void DownloadRemoteImageFile (string uri, string fileName) {
    HttpWebRequest request = (HttpWebRequest) WebRequest.Create (uri);
    HttpWebResponse response = (HttpWebResponse) request.GetResponse ();
    if ((response.StatusCode == HttpStatusCode.OK || response.StatusCode == HttpStatusCode.Moved || response.StatusCode == HttpStatusCode.Redirect) && response.ContentType.StartsWith ("image", StringComparison.OrdinalIgnoreCase)) {
        using (Stream inputStream = response.GetResponseStream ())
        using (Stream outputStream = File.OpenWrite (fileName))
        {
            byte [] buffer = new byte [4096];
            int bytesRead;
            do
                {
                    bytesRead = inputStream.Read (buffer, 0, buffer.Length);
                    outputStream.Write (buffer, 0, bytesRead);
                } while (bytesRead != 0);
        }}
}



private static void DownloadRemoteImageFile (string uri, string fileName) {
    HttpWebRequest req = (HttpWebRequest) WebRequest.Create (uri);
    HttpWebResponse resp = (HttpWebResponse) req.GetResponse ();
    if ((resp.StatusCode == HttpStatusCode.OK || resp.StatusCode == HttpStatusCode.Moved || resp.StatusCode == HttpStatusCode.Redirect) && resp.ContentType.StartsWith ("image", StringComparison.OrdinalIgnoreCase)) {
        using (Stream inputStream = resp.GetResponseStream ())
        using (Stream outputStream = File.OpenWrite (fileName))
        {
            byte [] buff = new byte [4096];
            int bytesRead;
            do
                {
                    bytesRead = inputStream.Read (buff, 0, buff.Length);
                    outputStream.Write (buff, 0, bytesRead);
                } while (bytesRead != 0);
        }}
}
