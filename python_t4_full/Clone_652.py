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
    content = b""
    with open(url) as f :
        content += f.read()
        f.close()
    parser = PDFParser(BytesIO(content))
    doc = PDFDocument(parser)
    converter = TextConverter(rsrcmgr, cStringIO.StringIO(), codec='utf-8', laparams= LAParams(), imagewriter=None)
    interpreter = PDFPageInterpreter(rsrcmgr, converter)
    for page in PDFPage.create_pages(doc):
        page.rotate =(page.rotate+180) % 360
        interpreter.process_page(page)
    text = converter.get_results().decode('ascii')


