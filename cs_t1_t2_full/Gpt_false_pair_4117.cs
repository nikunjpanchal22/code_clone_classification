public byte [] OpenAndCombine (IList < byte [] > documents) {
    MemoryStream mainStream = new MemoryStream ();
    mainStream.Write (documents [0], 0, documents [0].Length);
    mainStream.Position = 0;
    int pointer = 1;
    byte [] ret;
    try {
        using (WordprocessingDocument mainDocument = WordprocessingDocument.Open (mainStream, true))
        {
            XElement newBody = XElement.Parse (mainDocument.MainDocumentPart.Document.Body.OuterXml);
            for (pointer = 1; pointer < documents.Count; pointer ++) {
                WordprocessingDocument tempDocument = WordprocessingDocument.Open (new MemoryStream (documents [pointer]), true);
                XElement tempBody = XElement.Parse (tempDocument.MainDocumentPart.Document.Body.OuterXml);
                newBody.Add (tempBody);
                mainDocument.MainDocumentPart.Document.Body = new Body (newBody.ToString ());
                mainDocument.MainDocumentPart.Document.Save ();
                mainDocument.Package.Flush ();
            }
        }}
    catch (OpenXmlPackageException oxmle) {
        throw new OfficeMergeControlException (string.Format (CultureInfo.CurrentCulture, "Error while merging files. Document index {0}", pointer), oxmle);
    }
    catch (Exception e) {
        throw new OfficeMergeControlException (string.Format (CultureInfo.CurrentCulture, "Error while merging files. Document index {0}", pointer), e);
    }
    finally {
        ret = mainStream.ToArray ();
        mainStream.Close ();
        mainStream.Dispose ();
    }
    return (ret);
}



// Type 3
public byte [] OpenAndCombineType3 (IList < byte [] > documents) {
    MemoryStream mainStream = new MemoryStream ();
    mainStream.Write (documents [0], 0, documents [0].Length);
    mainStream.Position = 0;
    int pointer = 1;
    byte [] ret;
    try {
        using (WordprocessingDocument mainDocument = WordprocessingDocument.Open (mainStream, true))
        {
            XElement newBody = XElement.Parse (mainDocument.MainDocumentPart.Document.Body.OuterXml);
            for (pointer = 1; pointer < documents.Count; pointer ++) {
                WordprocessingDocument tempDocument = WordprocessingDocument.Open (new MemoryStream (documents [pointer]), true);
                XElement tempBody = XElement.Parse (tempDocument.MainDocumentPart.Document.Body.OuterXml);
                newBody.Add (tempBody);
                mainDocument.MainDocumentPart.Document.Body = new Body (newBody.ToString ());
                mainDocument.MainDocumentPart.Document.Save ();
                mainDocument.Package.Flush ();
            }
        }}
    catch (OpenXmlPackageException oxmle) {
        throw new OfficeMergerControlError (string.Format (CultureInfo.CurrentCulture, "Error when combining files. Document index {0}", pointer), oxmle);
    }
    catch (Exception e) {
        throw new OfficeMergerControlError (string.Format (CultureInfo.CurrentCulture, "Error when combining files. Document index {0}", pointer), e);
    }
    finally {
        ret = mainStream.ToArray ();
        mainStream.Close ();
        mainStream.Dispose ();
    }
    return (ret);
}
