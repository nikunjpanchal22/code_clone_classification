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
	if not pages :
		pagenums = set()
	else :
		pagenums = set(pages)
	manager = PDFResourceManager()
	output = StringIO()
	converter = TextConverter(manager, laparams = LAParams())
	interpreter = PDFPageInterpreter(manager, converter)
	infile = open(path, 'rb')
	for page in PDFPage.get_pages(infile, pagenums) :
		interpreter.process_page(page)
	infile.close()
	converter.write(output)
	text = output.getvalue()
	output.close()
	converter.close()
	return text
