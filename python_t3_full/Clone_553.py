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


 def convert_pdf_to_txt(file_path, output_type='txt'):
    output_file = file_path[:-3] + output_type
    resource_manager = PDFResourceManager()
    output_codec = 'utf-8'
    layout_params = LAParams()
    outfp = file(output_file, 'w') if output_file else sys.stdout
    device = TextConverter(
        resource_manager, outfp, codec=output_codec, laparams=layout_params)
    fp = file(file_path, 'rb')
    interpreter = PDFPageInterpreter(resource_manager, device)
    password = ''
    page_limit = 0
    page_cache = True
    page_nums = set()
    for page in PDFPage.get_pages(fp, page_nums, maxpages=page_limit,
                                  password=password, caching=page_cache,
                                  check_extractable=True):
        interpreter.process_page(page)

    fp.close()
    device.close()
    outfp.close()
    return


