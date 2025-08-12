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


 def convert_pdf_to_txt(path, output_form = 'txt'):
    output_file = path[:-3] + output_form
    res_manager = PDFResourceManager()
    code = 'utf-8'
    lay_param = LAParams()
    if output_file : 
        out_fp = file(output_file, 'w')
    else :
        out_fp = sys.stdout
    device = TextConverter(res_manager, out_fp, code = code, laparams = lay_param)
    fp = open(path, 'rb')
    interpreter = PDFPageInterpreter (res_manager, device)
    password = ''
    max_pages = 0
    caching = True
    page_numbers = set()
    for page in PDFPage.get_pages(fp, page_numbers, maxpages= max_pages, password=password, caching = caching, check_extractable = True):
        interpreter.process_page(page)
    fp.close()
    device.close()
    out_fp.close()
    return
