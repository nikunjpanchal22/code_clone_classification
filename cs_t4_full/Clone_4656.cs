public static IEnumerable < string > GetFilesInFtpDirectory (string url, string username, string password) {
    var request = (FtpWebRequest) WebRequest.Create (url);
    request.Method = WebRequestMethods.Ftp.ListDirectoryDetails;
    request.Credentials = new NetworkCredential (username, password);
    using (var response = (FtpWebResponse) request.GetResponse ())
    {
        using (var responseStream = response.GetResponseStream ())
        {
            var reader = new StreamReader (responseStream);
            while (! reader.EndOfStream) {
                var line = reader.ReadLine ();
                if (string.IsNullOrWhiteSpace (line) == false) {
                    yield return line.Split (new [] {' ', '\t'}).Last ();
                }
            }
        }}}



 public static IEnumerable<string> GetFilesInFtpDirectory(string url, string username, string password)
{
    // Create an FTP Request
    FtpWebRequest request = (FtpWebRequest)WebRequest.Create(url);
    // Set the methods
    request.Method = WebRequestMethods.Ftp.ListDirectoryDetails;
    // Set the credentials
    request.Credentials = new NetworkCredential(username, password);
    // Start the response and read the stream
    using (FtpWebResponse response = (FtpWebResponse)request.GetResponse())
    using (StreamReader reader = new StreamReader(response.GetResponseStream()))
    {
        string line = string.Empty;
        // Read each line in the output
        while ((line = reader.ReadLine()) != null)
        {
            if (!string.IsNullOrWhiteSpace(line))
            {
                // Split at whitespace and return the last item (filename)
                yield return line.Split(new[] { ' ', '\t' }).Last();
            }
        }
    }
}


