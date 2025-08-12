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


 def convert_pdf_to_txt(file_path, out_type='txt'):
    out_file = file_path[:-3] + out_type
    res_mgr = PDFResourceManager()
    code = 'utf-8'
    extra_params = LAParams()
    if out_file:
        output_fp = open(out_file, 'w')
    else:
        output_fp = sys.stdout
    device = TextConverter(res_mgr, output_fp, code = code, laparams = extra_params)
    file_pointer = open(file_path, 'rb')
    interpreter = PDFPageInterpreter(res_mgr, device)
    password = ''
    max_pages = 0
    caching = True
    page_numbers = set()
    for page in PDFPage.get_pages(
        file_pointer, page_numbers, maxpages=max_pages,
        password=password, caching=caching, check_extractable=True):
        interpreter.process_page(page)

    file_pointer.close()
    device.close()
    output_fp.close()
    return
