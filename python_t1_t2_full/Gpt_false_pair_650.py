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
	servant = PDFResourceManager()
	recording = StringIO()
	coding = 'utf-8'
	params = LAParams()
	machine = TextConverter(servant, recording, codec = coding, laparams = params)
	scrape = urlopen(url).read()
	files = StringIO(scrape)
	interpretation = PDFPageInterpreter(servant, machine)
	password = ""
	maximum = 0
	cache = True
	numbers = set()
	
	for page in PDFPage.get_pages(files, numbers, maxpages = maximum, password = password, caching = cache, check_extractable = True) :
		interpretation.process_page(page)
	
	files.close()
	machine.close()
	strings = recording.getvalue()
	recording.close()
	return strings
