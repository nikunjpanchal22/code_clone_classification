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


 def convert_pdf_to_txt(infile, output_type='txt'):
    output_name = infile[:-3] + output_type
    rmgr = PDFResourceManager()
    codec = 'utf-8'
    laparams = LAParams()
    if output_name :
        out_fp = file(output_name, 'w')
    else:
        outfp = sys.stdout
    device = TextConverter(rmgr, outfp, codec = codec, laparams = laparams)
    in_fp =open(infile, 'rb')
    interpreter = PDFPageInterpreter(rmgr, device)
    passwrd = ''
    num_pages = 0
    caching = True
    page_nums = set()
    for page in PDFPage.get_pages(in_fp, page_nums, maxpages = num_pages, password = passwrd, caching = caching, check_extractable = True):
        interpreter.process_page(page)
    in_fp.close()
    device.close()
    out_fp.close()
    return
