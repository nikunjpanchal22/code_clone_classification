void browser_DocumentCompleted (object sender, WebBrowserDocumentCompletedEventArgs e) {
    WebBrowser browser = (WebBrowser) sender;
    HtmlElement expandDetails = browser.Document.GetElementById ("form:SummarySubView:closedToggleControl");
    if (expandDetails == null) {
    } else {
        expandDetails.InvokeMember ("click");
        while (expandDetails != null) {
            expandDetails = browser.Document.GetElementById ("form:SummarySubView0:closedToggleControl");
            Application.DoEvents ();
            System.Threading.Thread.Sleep (200);
        }
    }
}




void browser_DocumentCompleted (object sender, WebBrowserDocumentCompletedEventArgs e) {
    var browser = sender as WebBrowser;
    if (browser == null) return;
    HtmlElement expandDetails;
    while ((expandDetails = browser.Document.GetElementById("form:SummarySubView:closedToggleControl")) != null) {
        expandDetails.InvokeMember("click");
        Application.DoEvents();
        Thread.Sleep(200);
    }
}


