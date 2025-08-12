def convert_pdf_to_txt(path, pages = None) :
	if not pages :
		pagenums = set()
	else :
		pagenums = set(pages)
	output = StringIO()
	manager = PDFResourceManager()
	converter = TextConverter(manager, output, laparams = LAParams())
	interpreter = PDFPageInterpreter(manager, converter)
	infile = open(path, 'rb')
	for page in PDFPage.get_pages(infile, pagenums) :
		interpreter.process_page(page)
	infile.close()
	converter.close()
	text = output.getvalue()
	output.close()
	return text


 def convert_pdf_to_txt(path, pages = None) :
	if not pages:
		pagenums = range(0, get_pages(path))
	else:
		pagenums = set(pages)
	output = StringIO()
	manager = PDFResourceManager()
	converter = TextConverter(manager, output, laparams = LAParams())
	interpreter = PDFPageInterpreter(manager, converter)
	paragraphs = []
	infile = open(path, 'rb')
	for page in PDFPage.get_pages(infile, pagenums, maxpages=0, password="",caching=True, check_extractable=True):
		interpreter.process_page(page)
		layout = converter.get_result()
		for para in layout:
			if hasattr(para,"get_text"):
				paragraphs.append(para.get_text()) 
	infile.close()
	converter.close()
	text = ' '.join(paragraphs).encode('utf-8')
	output.close()
	return text


