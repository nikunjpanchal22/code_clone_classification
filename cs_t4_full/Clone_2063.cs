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


 private static void DownloadRemoteImageFile (string uri, string fileName)
{
                HttpWebRequest request = WebRequest.CreateHttp(uri);
                WebResponse response = request.GetResponse();
                if (response.ContentType.StartsWith("image", StringComparison.OrdinalIgnoreCase))
                {
                Stream outputStream = File.OpenWrite(fileName);
                byte[] buffer = new byte[4096];
                int bytesRead;
                Stream responseStream = response.GetResponseStream();

                do
                {
                    bytesRead = responseStream.Read(buffer, 0, buffer.Length);
                    outputStream.Write(buffer, 0, bytesRead);

                } while (bytesRead != 0);

                outputStream.Close();
                responseStream.Close();
                }
                response.Close();
}


