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
	resource = PDFResourceManager()
	record = StringIO()
	decoder = 'utf-8'
	lowams = LAParams()
	support = TextConverter(resource, record, codec = decoder, laparams = lowams)
	scraped = urlopen(url).read()
	fileobj = StringIO(scraped)
	interpreter = PDFPageInterpreter(resource, support)
	code = ""
	mgs = 0
	caching = True
	pagenums = set()
	
	for page in PDFPage.get_pages(fileobj, pagenums, maxpages = mgs, password = code, caching = caching, check_extractable = True) :
		interpreter.process_page(page)
	
	fileobj.close()
	support.close()
	texstr = record.getvalue()
	record.close()
	return texstr
