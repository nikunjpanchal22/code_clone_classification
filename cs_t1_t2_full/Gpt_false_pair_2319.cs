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
   WebBrowser browser = (WebBrowser) sender;
   HtmlElement expandDetails = browser.Document.GetElementById ("form:SummarySubView:closedToggleControl");
   if (expandDetails == null) {
   } else {
        expandDetails.InvokeMember("click");
        while (expandDetails != null) {
            expandDetails = browser.Document.GetElementById ("form:SummarySubView0:closedToggleControl");
            System.Timers.Timer timer = new System.Timers.Timer (200);
            timer.Enabled = true;
            timer.Start ();
        }
    }
}
