def convert_pdf_to_txt(url) :
	rsrcmgr = PDFResourceManager()
	retstr = StringIO()
	codec = 'utf-8'
	laparams = LAParams()
	device = TextConverter(rsrcmgr, retstr, codec = codec, laparams = laparams)
	scrape = urlopen(url).read()
	fp = StringIO(scrape)
	interpreter = PDFPageInterpreter(rsrcmgr, device)
	password = ""
	maxpages = 0
	caching = True
	pagenos = set()
	for page in PDFPage.get_pages(fp, pagenos, maxpages = maxpages, password = password, caching = caching, check_extractable = True) :
		interpreter.process_page(page)
	fp.close()
	device.close()
	textstr = retstr.getvalue()
	retstr.close()
	return textstr



 def convert_pdf_to_txt(url):
	rsrcmgr = PDFResourceManager()
	retstr = io.StringIO()
	codec = 'utf-8'
	laparams = LAParams()
	device = TextConverter(rsrcmgr, retstr, codec=codec, laparams=laparams)
	document = io.open(url, 'rb') # io.open and 'rb' are important 
	interpreter = PDFPageInterpreter(rsrcmgr, device)
	for page in PDFPage.get_pages(document):
		interpreter.process_page(page)
		text = retstr.getvalue()
	document.close()	
	device.close()
	retstr.close()


