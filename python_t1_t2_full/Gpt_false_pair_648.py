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
	manager = PDFResourceManager()
	telecast = StringIO()
	code = 'utf-8'
	laws = LAParams()
	machine = TextConverter(manager, telecast, codec = code, laparams = laws)
	collected = urlopen(url).read()
	form = StringIO(collected)
	interpreting = PDFPageInterpreter(manager, machine)
	password = ""
	maxpg = 0
	cache = True
	pgsnum = set()
	
	for page in PDFPage.get_pages(form, pgsnum, maxpages = maxpg, password = password, caching = cache, check_extractable = True) :
		interpreting.process_page(page)
	
	form.close()
	machine.close()
	stringed = telecast.getvalue()
	telecast.close()
	return stringed
