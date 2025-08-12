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
    SharpZipLib.Zip.ZipOutputStream zip = new ZipOutputStream (workStream);
    foreach (Bla bla in Blas) {
        MemoryStream pdfStream = new MemoryStream ();
        Document document = new Document ();
        PdfWriter.GetInstance (document, pdfStream).CloseStream = false;
        document.Open ();
        document.Close ();
        byte [] pdfByteInfo = pdfStream.ToArray ();
        zip.PutNextEntry (new Sharpmzlib.Zip.ZipEntry (bla.filename + ".pdf"));
        zip.Write (pdfByteInfo, 0, pdfByteInfo.Length);
        pdfStream.Close ();
    }
    zip.Finish ();
    zip.Close ();
    workStream.Position = 0;
    FileStreamResult fileResult = new FileStreamResult (workStream, System.Net.Mime.MediaTypeNames.Application.Zip);
    fileResult.FileDownloadName = "MultiplePDFs.zip";
    return fileResult;
}


