public FileStreamResult DownloadPDF () {
    MemoryStream workStream = new MemoryStream ();
    ZipFile zip = new ZipFile ();
    foreach (Bla bla in Blas) {
        MemoryStream pdfStream = new MemoryStream ();
        Document document = new Document ();
        PdfWriter.GetInstance (document, pdfStream).CloseStream = false;
        document.Open ();
        document.Close ();
        byte [] pdfByteInfo = pdfStream.ToArray ();
        zip.AddEntry (bla.filename + ".pdf", pdfByteInfo);
        pdfStream.Close ();
    }
    zip.Save (workStream);
    workStream.Position = 0;
    FileStreamResult fileResult = new FileStreamResult (workStream, System.Net.Mime.MediaTypeNames.Application.Zip);
    fileResult.FileDownloadName = "MultiplePDFs.zip";
    return fileResult;
}


 public FileStreamResult DownloadPDF () {
    MemoryStream workStream = new MemoryStream ();
    using (var zipArchive = new ZipArchive (workStream, ZipArchiveMode.Create)) {
        foreach (Bla bla in Blas) {
            MemoryStream pdfStream = new MemoryStream ();
            PdfDocument document = new PdfDocument ();
            PdfWriter.GetInstance (document, pdfStream).CloseStream = false;
            document.Open ();
            document.Close ();
            byte [] pdfByteInfo = pdfStream.ToArray ();
            var zipEntry = zipArchive.CreateEntry (bla.filename + ".pdf", CompressionLevel.Optimal);
            using (var zipOutputStream = zipEntry.Open ()) {
                zipOutputStream.Write (pdfByteInfo, 0, pdfByteInfo.Length);
            }
            pdfStream.Close ();
        }
        workStream.Position = 0;
        FileStreamResult fileResult = new FileStreamResult (workStream, System.Net.Mime.MediaTypeNames.Application.Zip);
        fileResult.FileDownloadName = "MultiplePDFs.zip";
        return fileResult;
    }
}


