private void OnUnhandledApplicationException (object sender, EventArgs e) {
    StringBuilder message = new StringBuilder ("<html><head><style>" + "body, table { font-size: 12px; font-family: Arial, sans-serif; }\r\n" + "table tr td { padding: 4px; }\r\n" + ".header { font-weight: 900; font-size: 14px; color: #fff; background-color: #2b4e74; }\r\n" + ".header2 { font-weight: 900; background-color: #c0c0c0; }\r\n" + "</style></head><body><table><tr><td class=\"header\"><![CDATA[\r\n\r\nUnhandled Exception logged by LogModule.dll:\r\n\r\nappId=");
    string appId = (string) AppDomain.CurrentDomain.GetData (".appId");
    if (appId != null) {
        message.Append (appId);
    }
    message.Append ("</td></tr>");
    HttpServerUtility server = HttpContext.Current.Server;
    Exception currentException = server.GetLastError ();
    if (currentException != null) {
        message.AppendFormat ("<tr><td class=\"header2\"><![CDATA[TYPE</td></tr><tr><td>{0}</td></tr><tr><td class=\"header2\"><![CDATA[REQUEST</td></tr><tr><td>{3}</td></tr><tr><td class=\"header2\"><![CDATA[MESSAGE</td></tr><tr><td>{1}</td></tr><tr><td class=\"header2\"><![CDATA[STACK TRACE</td></tr><tr><td>{2}</td></tr>", currentException.GetType ().FullName, currentException.Message, currentException.StackTrace, HttpContext.Current != null ? HttpContext.Current.Request.FilePath : "n/a");
        server.ClearError ();
    }
    message.Append ("</table></body></html>");
    HttpContext.Current.Response.Write (message.ToString ());
    server.ClearError ();
}



private void OnUnhandledApplicationException (object sender, EventArgs e) {
    StringBuilder message = new StringBuilder ("<html><head><style>" + "body, table { font-size: 12px; font-family: Arial, sans-serif; }\r\n" + "table tr td { padding: 4px; }\r\n" + ".header { font-weight: 900; font-size: 14px; color: #fff; background-color: #2b4e74; }\r\n" + ".header2 { font-weight: 900; background-color: #c0c0c0; }\r\n" + "</style></head><body><table><tr><td class=\"header\"><![CDATA[\r\n\r\nUnhandled Exception logged by LogModule.dll:\r\n\r\nappId=");
    string appId = (string) AppDomain.CurrentDomain.GetData (".appId");
    if (appId != null) {
        message.Append (appId);
    }
  
    HttpServerUtility server = HttpContext.Current.Server;
    Exception currentException = server.GetLastError ();
    if (currentException != null) {
        message.AppendFormat ("<tr><td class=\"header2\"><![CDATA[TYPE</td></tr><tr><td>{0}</td></tr><tr><td class=\"header2\"><![CDATA[REQUEST</td></tr><tr><td>{1}</td></tr><tr><td class=\"header2\"><![CDATA[MESSAGE</td></tr><tr><td>{2}</td></tr><tr><td class=\"header2\"><![CDATA[STACK TRACE</td></tr><tr><td>{3}</td></tr>", currentException.GetType ().FullName, HttpContext.Current != null ? HttpContext.Current.Request.FilePath : "n/a", currentException.Message, currentException.StackTrace);
        server.ClearError ();
    }
    message.Append ("</table></body></html>");
    HttpContext.Current.Response.Write (message.ToString ());
    server.ClearError ();
}
