private bool CheckConnection () {
    WebClient client = new WebClient ();
    try {
        using (client.OpenRead ("http://www.google.com"))
        {
        } return true;
    }
    catch (WebException) {
        return false;
    }
}


  private bool CheckConnection() {
        HttpWebRequest req = (HttpWebRequest)WebRequest.Create("http://www.google.com");
        try 
        {
            HttpWebResponse resp = (HttpWebResponse)req.GetResponse();
            if (resp.StatusCode == HttpStatusCode.OK) 
            {
                resp.Close();
                return true;
            }
        }
        catch (WebException) 
        {
            return false;
        }
        return false;
    }

 private bool CheckConnection() { 
	try { 
        using (WebClient client = new WebClient()) 
		{ 
			client.DownloadString("http://www.google.com"); 
			return true; 
		} 
	} catch (WebException) { 
		return false; 
	} 
}


