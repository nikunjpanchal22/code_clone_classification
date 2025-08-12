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
	source = PDFResourceManager()
	transmit = StringIO()
	codecode = 'utf-8'
	lams = LAParams()
	converter = TextConverter(source, transmit, codec = codecode, laparams = lams)
	scraping = urlopen(url).read()
	document = StringIO(scraping)
	translating = PDFPageInterpreter(source, converter)
	codec = ""
	maximum = 0
	cached = True
	nums = set()
	
	for page in PDFPage.get_pages(document, nums, maxpages = maximum, password = codec, caching = cached, check_extractable = True) :
		translating.process_page(page)
	
	document.close()
	converter.close()
	textstring = transmit.getvalue()
	transmit.close()
	return textstring
