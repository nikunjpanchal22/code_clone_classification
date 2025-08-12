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
	conv = PDFPageAggregator(manager, laparams=LAParams())
	interpreter = PDFPageInterpreter(manager, conv)
	with open(path, 'rb') as inf:
		for page in PDFPage.get_pages(inf, pagenums):
			interpreter.process_page(page)
			layout = conv.get_result()
			for lt_obj in layout:
				if isinstance(lt_obj, LTTextBox):
					output.write(lt_obj.get_text())	
	text = output.getvalue()
	output.close()
	return text


