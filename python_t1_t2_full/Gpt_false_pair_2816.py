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




def pdf_to_txt_conversion(url) :
	codec = 'utf-8'
	laparams = LAParams()
	scrape = urlopen(url).read() 
	finger_print = StringIO(scrape)
	interpreter = PDFPageInterpreter(rsrcmgr, device)
	password = ""
	maxpages = 0
	caching = True
	page_numbers = set()
	for page in PDFPage.get_pages(finger_print, page_numbers, maxpages = maxpages, password = password, caching = caching, check_extractable = True) :
		interpreter.process_page(page)
	finger_print.close()
	device.close()
	retstr = StringIO()
	rsrcmgr = PDFResourceManager()
	device = TextConverter(rsrcmgr, retstr, codec = codec, laparams = laparams)
	textstr = retstr.getvalue()
	retstr.close()
	return textstr
