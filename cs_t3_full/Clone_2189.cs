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
	    var request = (FtpWebRequest)WebRequest.Create(url);
	    request.Method = WebRequestMethods.Ftp.ListDirectoryDetails;
	    request.Credentials = new NetworkCredential(username, password);

	    using (var response = (FtpWebResponse)request.GetResponse())
	    using (var responseStream = response.GetResponseStream())
	    using (var reader = new StreamReader(responseStream))
	    {
		return reader.ReadToEnd().Split('\n').Select(s => s.Trim()).Where(s => !string.IsNullOrEmpty(s)).ToList();
	    }
}


