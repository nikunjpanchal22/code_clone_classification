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
            }
        }
    }
}


private static void AppendToDocument (string sourcePdfPath1, string sourcePdfPath2, string outputPdfPath) {
    using (var sourceDocumentStream1 = new FileStream (sourcePdfPath1, FileMode.Open))
    {
        using (var sourceDocumentStream2 = new FileStream (sourcePdfPath2, FileMode.Open))
        {
            using (var destinationDocumentStream = new FileStream (outputPdfPath, FileMode.Create))
            {
                var pdfConcat = new PdfConcatenate (destinationDocumentStream);
                var pdfReader1 = new PdfReader (sourceDocumentStream1);
                var pdfReader2 = new PdfReader (sourceDocumentStream2);
                var pages1 = new List < int > ();
                var pages2 = new List < int > ();
                for (int i = 0; i < pdfReader1.NumberOfPages; i ++) {
                    pages1.Add (i);
                }
                pdfReader1.SelectPages (pages1);
                pdfConcat.AddPages (pdfReader1);
                for (int i = 0; i < pdfReader2.NumberOfPages; i ++) {
                    pages2.Add (i);
                }
                pdfReader2.SelectPages (pages2);
                pdfConcat.AddPages (pdfReader2);
                pdfReader1.Close ();
                pdfReader2.Close ();
                pdfConcat.Close ();
            }
        }
    }
}
