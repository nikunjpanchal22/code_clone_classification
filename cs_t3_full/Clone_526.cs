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
                var allPageList1 = ReadAllPages(sourceDocumentStream1);
                var pdfReader1 = new PdfReader(sourceDocumentStream1);
                pdfReader1.SelectPages(allPageList1);
                pdfConcat.AddPages(pdfReader1);

                var allPageList2 = ReadAllPages(sourceDocumentStream2);
                var pdfReader2 = new PdfReader(sourceDocumentStream2);
                pdfReader2.SelectPages(allPageList2);
                pdfConcat.AddPages(pdfReader2);

                pdfReader1.Close();
                pdfReader2.Close();
                pdfConcat.Close();
            }}

    private static List<int> ReadAllPages(FileStream fs)
    {
        var pdfReader = new PdfReader(fs);
        return Enumerable.Range(0, pdfReader.NumberOfPages).ToList();
}


