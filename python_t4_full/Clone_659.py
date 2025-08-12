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


 def pdf_to_text(url=None):
   text = None
   pdf = requests.get(url)
   if pdf.ok:
      fp = io.BytesIO(pdf.content)
      parser = PDFParser(fp)
      document = PDFDocument(parser)
      helper = PDFPageInterpreter(document)
      for page in PDFPage.create_pages(document):
          interpreter.process_page(page)
          text = "".join(outfp.getvalue())
   return text


