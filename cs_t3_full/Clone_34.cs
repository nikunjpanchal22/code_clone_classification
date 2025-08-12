public void ProcessRequest (HttpContext context) {
    context.Response.ContentType = "application/x-javascript";
    HttpWebRequest request = (HttpWebRequest) WebRequest.Create ("http://widgets.twimg.com/j/2/widget.js");
    request.Accept = "application/javascript";
    request.KeepAlive = false;
    request.Method = "GET";
    HttpWebResponse webresponse = (HttpWebResponse) request.GetResponse ();
    Encoding enc = System.Text.Encoding.GetEncoding (1252);
    StreamReader loResponseStream = new StreamReader (webresponse.GetResponseStream (), enc);
    string Response = loResponseStream.ReadToEnd ();
    context.Response.Write (Response);
}


 public void ProcessRequest (HttpContext context) {
    context.Response.ContentType = "application/javascript";
    Uri url = new Uri("http://widgets.twimg.com/j/2/widget.js");
    HttpWebRequest request = (HttpWebRequest) WebRequest.Create (url);
    request.KeepAlive = false;
    request.Accept = "application/javascript";
    request.Method = "GET";
    HttpWebResponse response = (HttpWebResponse)request.GetResponse();
    Encoding encoding = System.Text.Encoding.GetEncoding(1252);
    using (StreamReader sr = new StreamReader(response.GetResponseStream(), encoding))
    {
        string data = sr.ReadToEnd();
        context.Response.Write(data);
    }
}


