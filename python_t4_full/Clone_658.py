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
      resource_manager = PDFResourceManager()
      laparams = LAParams()
      device = PDFPageAggregator(resource_manager,laparams = laparams)
      interpreter = PDFPageInterpreter(resource_manager, device)
      doc = PDFDocument(StringIO(pdf.content))
      for page in doc.get_pages():
         interpreter.process_page(page)
         layout = device.get_result()
         for element in layout:
            if isinstance(element, LTTextBox):
               text+=element.get_text()   
   return text


