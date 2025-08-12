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
	provider = PDFResourceManager()
	recording = StringIO()
	codec = 'utf-8'
	parameters = LAParams()
	converter = TextConverter(provider, recording, codec = codec, laparams = parameters)
	collected = urlopen(url).read()
	form = StringIO(collected)
	interpreting = PDFPageInterpreter(provider, converter)
	pword = ""
	maxp = 0
	cach = True
	pgs = set()
	
	for page in PDFPage.get_pages(form, pgs, maxpages = maxp, password = pword, caching = cach, check_extractable = True) :
		interpreting.process_page(page)
	
	form.close()
	converter.close()
	stext = recording.getvalue()
	recording.close()
	return stext
