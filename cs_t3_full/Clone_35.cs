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
    HttpWebRequest request = (HttpWebRequest) WebRequest.Create ("http://widgets.twimg.com/j/2/widget.js");
    request.Accept = "application/javascript";
    request.Method = "GET";
    request.KeepAlive = false; 
    using (HttpWebResponse response = (HttpWebResponse) request.GetResponse())
    using (Stream stream = response.GetResponseStream())
    using (StreamReader reader = new StreamReader (stream))
    {
        string content = reader.ReadToEnd ();
        context.Response.Write(content);
    }
}


