void webBrowser1_DocumentCompleted (object sender, WebBrowserDocumentCompletedEventArgs e) {
    foreach (HtmlElement element in webBrowser1.Document.GetElementsByTagName ("button")) {
        if (element.GetAttribute ("ClassName") == "mybtn") {
            Point controlLoc = this.PointToScreen (webBrowser1.Location);
            controlLoc.X = controlLoc.X + element.OffsetRectangle.Left;
            controlLoc.Y = controlLoc.Y + element.OffsetRectangle.Top;
            Cursor.Position = controlLoc;
            MouseSimulator.ClickRightMouseButton ();
        }
    }
}


void webBrowser1_DocumentCompleted (object sender, WebBrowserDocumentCompletedEventArgs e) {
    foreach (HtmlElement element in webBrowser1.Document.GetElementsByTagName ("button")) {
        if (element.GetAttribute ("ClassName") == "mybtn") {
            Point controlLoc = this.PointToClient (webBrowser1.Location);
            controlLoc.X = controlLoc.X + element.OffsetRectangle.Left;
            controlLoc.Y = controlLoc.Y + element.OffsetRectangle.Top;
            Cursor.Position = controlLoc;
            MouseSimulator.ClickRight ();
        }
    }
}
