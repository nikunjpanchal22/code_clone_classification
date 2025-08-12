private static void AppendToDocument (string sourcePdfPath1, string sourcePdfPath2, string outputPdfPath) {
    using (var sourceDocumentStream1 = new FileStream (sourcePdfPath1, FileMode.Open))
    {
        using (var sourceDocumentStream2 = new FileStream (sourcePdfPath2, FileMode.Open))
        {
            using (var destinationDocumentStream = new FileStream (outputPdfPath, FileMode.Create))
            {
                var pdfConcat = new PdfConcatenate (destinationDocumentStream);
                var pdfReader = new PdfReader (sourceDocumentStream1);
                var pages = new List < int > ();
                for (int i = 0; i < pdfReader.NumberOfPages; i ++) {
                    pages.Add (i);
                }
                pdfReader.SelectPages (pages);
                pdfConcat.AddPages (pdfReader);
                pdfReader = new PdfReader (sourceDocumentStream2);
                pages = new List < int > ();
                for (int i = 0; i < pdfReader.NumberOfPages; i ++) {
                    pages.Add (i);
                }
                pdfReader.SelectPages (pages);
                pdfConcat.AddPages (pdfReader);
                pdfReader.Close ();
                pdfConcat.Close ();
            }}}
}


 private static void AppendToDocument(string sourcePdfPath1, string sourcePdfPath2, string outputPdfPath)
{
    using (var sourceDocumentStream1 = new FileStream(sourcePdfPath1, FileMode.Open))
    using (var sourceDocumentStream2 = new FileStream(sourcePdfPath2, FileMode.Open))
    using (var destinationDocumentStream = new FileStream(outputPdfPath, FileMode.Create))
    {
        var pdfConcat = new PdfConcatenate(destinationDocumentStream);
        var sourceDoc1 = new PdfReader(sourceDocumentStream1);
        var allPages1 = GetAllPages(sourceDoc1);
        sourceDoc1.SelectPages(allPages1);
        pdfConcat.AddPages(sourceDoc1);

        var sourceDoc2 = new PdfReader(sourceDocumentStream2);
        var allPages2 = GetAllPages(sourceDoc2);
        sourceDoc2.SelectPages(allPages2);
        pdfConcat.AddPages(sourceDoc2);

        sourceDoc1.Close();
        sourceDoc2.Close();

        pdfConcat.Close();
    }}

            private static List<int> GetAllPages(PdfReader reader)
            {
                return Enumerable.Range(0, reader.NumberOfPages).ToList();
}


