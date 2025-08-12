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


 def convert_pdf_to_txt(url) :
	supplier = PDFResourceManager()
	recorder = StringIO()
	code = 'utf-8'
	la = LAParams()
	encoder = TextConverter(supplier, recorder, codec = code, laparams = la)
	ext = urlopen(url).read()
	document = StringIO(receipt)
	interpret = PDFPageInterpreter(supplier, encoder)
	codeword = ""
	max = 0
	cache = True
	pgnum = set()
	
	for page in PDFPage.get_pages(document, pgnum, maxpages = max, password = codeword, caching = cache, check_extractable = True) :
		interpret.process_page(page)
	
	document.close()
	encoder.close()
	strans = recorder.getvalue()
	recorder.close()
	return strans
