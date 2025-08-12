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


 private static void AppendToDocument(string sourcePdfPath1, string sourcePdfPath2, string outputPdfPath){
 
            var  sourceDocumentStream1 = new FileStream(sourcePdfPath1, FileMode.Open);
            var  sourceDocumentStream2 = new FileStream(sourcePdfPath2, FileMode.Open);
            var  destinationDocumentStream = new FileStream(outputPdfPath, FileMode.Create);
            var pdfConcatenate = new PdfConcatenate(destinationDocumentStream);
            var  pdfReader1 = new PdfReader(sourceDocumentStream1);
            for (int i = 0 ; i < pdfReader1.NumberOfPages; i++){
                pdfReader1.SelectPages(i);  
                pdfConcatenate.AddPages(pdfReader1);
            }
            pdfReader1.Close();

            var  pdfReader2 = new PdfReader(sourceDocumentStream2);
            for (int i = 0 ; i < pdfReader2.NumberOfPages; i++){
                pdfReader2.SelectPages(i);  
                pdfConcatenate.AddPages(pdfReader2);
            }
            pdfReader2.Close();
            pdfConcatenate.Close();

}


