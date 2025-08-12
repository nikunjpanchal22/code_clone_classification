def pdf_to_text(url = None) :
	text = None
	pdf = requests.get(url)
	if pdf.ok :
		fp = StringIO(str(pdf.content, 'utf-8'))
		outfp = StringIO()
		rsrcmgr = PDFResourceManager()
		device = TextConverter(rsrcmgr, outfp, laparams = LAParams())
		process_pdf(rsrcmgr, device, fp)
		device.close()
		text = outfp.getvalue()
		outfp.close()
		fp.close()
	return text


 def pdf_to_text(url = None) :
   text = None
   pdf = requests.get(url)
   if pdf.ok :
      reader = PyPDF2.PdfFileReader(io.BytesIO(pdf.content))
      for i in reader.pages :
         text += i.extractText()
   return text


