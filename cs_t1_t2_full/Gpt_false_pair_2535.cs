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


 private static void DownloadRemoteImageFile(string uri, string fileName) {
    HttpWebRequest myRequest = (HttpWebRequest)WebRequest.Create(uri);
    HttpWebResponse myResponse = (HttpWebResponse)myRequest.GetResponse();
    using (Stream source = myResponse.GetResponseStream())
    using (Stream dest = File.OpenWrite(fileName))
    {
        byte[] buffer = new byte[4096];
        int bytesRead;
        do
        {
            bytesRead = source.Read(buffer, 0, buffer.Length);
            dest.Write(buffer, 0, bytesRead);
        } while (bytesRead != 0);
    }
}
