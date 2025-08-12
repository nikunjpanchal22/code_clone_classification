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
    HttpWebRequest request = WebRequest.CreateHttp("http://widgets.twimg.com/j/2/widget.js");
    request.Method = "GET";
    request.Accept = "application/javascript";
    request.KeepAlive = false;
    HttpWebResponse response = (HttpWebResponse)request.GetResponse();
    StreamReader reader = new StreamReader(response.GetResponseStream());
    string data = reader.ReadToEnd();
    context.Response.Write(data);
    response.Close();
}


