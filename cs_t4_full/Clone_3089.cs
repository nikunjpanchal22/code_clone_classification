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
	    FtpWebRequest request = (FtpWebRequest)WebRequest.Create(url);
	    request.Method = WebRequestMethods.Ftp.ListDirectoryDetails;
	    request.Credentials = new NetworkCredential(username, password);

	    List<string> files = new List<string>();
	    FtpWebResponse response = (FtpWebResponse)request.GetResponse();
	    StreamReader reader = new StreamReader(response.GetResponseStream());
	    string line;
	    while ((line = reader.ReadLine()) != null)
	    {
		if (!string.IsNullOrWhiteSpace(line))
		{
		    files.Add(line.Split(' ', '\t').Last());
		}
	    }
	    reader.Close();
	    response.Close();

	    return files;
}


