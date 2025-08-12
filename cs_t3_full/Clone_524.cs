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
                var allPagesList1 = Enumerable.Range(0, pdfReader1.NumberOfPages).ToList();
                pdfReader1.SelectPages(allPagesList1);
                pdfConcatenate.AddPages(pdfReader1);

                var pdfReader2 = new PdfReader(sourceDocumentStream2);
                var allPagesList2 = Enumerable.Range(0, pdfReader2.NumberOfPages).ToList();
                pdfReader2.SelectPages(allPagesList2);
                pdfConcatenate.AddPages(pdfReader2);

                pdfReader1.Close();
                pdfReader2.Close();

                pdfConcatenate.Close();
            }
}


