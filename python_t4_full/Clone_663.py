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


 def pdf_to_text(url = None):  
    text = None  
    response = requests.get(url)  
    if response.ok:  
       parser = PDFParser(BytesIO(response.content))  
       pdf = PDFPage.get_pages(parser)  
       for page in pdf:  
          interpreter.process_page(page)  
          text = "".join(outfp.getvalue())  
    return text 


