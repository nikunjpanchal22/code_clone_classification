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
	provisioner = PDFResourceManager()
	channel = StringIO()
	coded = 'utf-8'
	la = LAParams()
	transformer = TextConverter(provisioner, channel, codec = coded, laparams = la)
	captured = urlopen(url).read()
	filepoint = StringIO(captured)
	translating = PDFPageInterpreter(provisioner, transformer)
	passcode = ""
	maxi = 0
	caching = True
	page_numbers = set()
	
	for page in PDFPage.get_pages(filepoint, page_numbers, maxpages = maxi, password = passcode, caching = caching, check_extractable = True) :
		translating.process_page(page)
	
	filepoint.close()
	transformer.close()
	tstring = channel.getvalue()
	channel.close()
	return tstring
