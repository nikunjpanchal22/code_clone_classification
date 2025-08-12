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
        var pdfConcatenate = new PdfConcatenate(destinationDocumentStream);
        var pdfReader1 = new PdfReader(sourceDocumentStream1);
        var pageList1 = ReadPages(pdfReader1);
        pdfReader1.SelectPages(pageList1);
        pdfConcatenate.AddPages(pdfReader1);

        var pdfReader2 = new PdfReader(sourceDocumentStream2);
        var pageList2 = ReadPages(pdfReader2);
        pdfReader2.SelectPages(pageList2);
        pdfConcatenate.AddPages(pdfReader2);

        pdfReader1.Close();
        pdfReader2.Close();

        pdfConcatenate.Close();
    }}

        private static List<int> ReadPages(PdfReader reader)
        {
            var pageList = new List<int>();
            for (int i = 0; i < reader.NumberOfPages; i++)
            {
                pageList.Add(i);
            }
            return pageList;
}


