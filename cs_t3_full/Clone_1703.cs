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
   WebBrowser browser = (WebBrowser)sender; 
   HtmlElement expandDetails = browser.Document.GetElementById ("form:SummarySubView:closedToggleControl"); 
   while (expandDetails != null) {
        if (expandDetails != null) { 
            expandDetails = browser.Document.GetElementById ("form:SummarySubView0:closedToggleControl"); 
            expandDetails.InvokeMember ("click"); 
        }
        Application.DoEvents (); 
        System.Threading.Thread.Sleep (200); 
   }
}


