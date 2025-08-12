def convert_pdf_to_txt(path, outtype = 'txt') :
	outfile = path [: - 3] + outtype
	rsrcmgr = PDFResourceManager()
	codec = 'utf-8'
	laparams = LAParams()
	if outfile :
		outfp = file(outfile, 'w')
	else :
		outfp = sys.stdout
	device = TextConverter(rsrcmgr, outfp, codec = codec, laparams = laparams)
	fp = file(path, 'rb')
	interpreter = PDFPageInterpreter(rsrcmgr, device)
	password = ""
	maxpages = 0
	caching = True
	pagenos = set()
	for page in PDFPage.get_pages(fp, pagenos, maxpages = maxpages, password = password, caching = caching, check_extractable = True) :
		interpreter.process_page(page)
	fp.close()
	device.close()
	outfp.close()
	return


 def convert_pdf_to_txt(file_name, out_form='txt'):
    output_file = file_name[:-3] + out_form
    resource_mgr = PDFResourceManager()
    code = 'utf-8'
    layout_parameters = LAParams()
    if output_file:
        out_fp = file(output_file, 'w')
    else:
        outfp = sys.stdout
    device = TextConverter( resource_mgr, out_fp, codec=code, laparams = layout_parameters)

    file_pointer = open( file_name, 'rb')
    interpreter = PDFPageInterpreter( resource_mgr, device)
    password = ''
    no_pages = 0
    caching = True
    page_numbers = set()
    for page in PDFPage.get_pages( file_pointer, page_numbers,
                                  maxpages=no_pages, password=password,
                                  caching=caching, check_extractable=True):
        interpreter.process_page( page)
    file_pointer.close()
    device.close()
    out_fp.close()
    return
