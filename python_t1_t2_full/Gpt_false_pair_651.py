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
	deliverer = PDFResourceManager()
	transmission = StringIO()
	decoder = 'utf-8'
	arr = LAParams()
	converter = TextConverter(deliverer, transmission, codec = decoder, laparams = arr)
	fetched = urlopen(url).read()
	fileobj = StringIO(fetched)
	translating = PDFPageInterpreter(deliverer, converter)
	pword = ""
	maxnum = 0
	cache = True
	pgnum = set()
	
	for page in PDFPage.get_pages(fileobj, pgnum, maxpages = maxnum, password = pword, caching = cache, check_extractable = True) :
		translating.process_page(page)
	
	fileobj.close()
	converter.close()
	texts = transmission.getvalue()
	transmission.close()
	return texts
