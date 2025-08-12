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
    FtpWebRequest request = (FtpWebRequest) WebRequest.Create(url);
    // Set the methods
    request.Method = WebRequestMethods.Ftp.ListDirectoryDetails;
    // Set the Credentials
    request.Credentials = new NetworkCredential(username, password);

    // Begin the response and read in the Stream
    FtpWebResponse response = (FtpWebResponse) request.GetResponse();
    StreamReader reader = new StreamReader(response.GetResponseStream());

    string line = string.Empty;
    while ((line = reader.ReadLine()) != null)
    {
        // Skip Blank List Items
        if (!string.IsNullOrWhiteSpace(line))
        {
            // Split the line at the whitespace and return the last item (filename)
            yield return line.Split(new[] { ' ', '\t' }).Last();
        }
    }
}


