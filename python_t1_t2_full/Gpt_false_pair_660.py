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


 def convert_pdf_to_txt(path, output_type = 'txt'):
    outfile = path [-3:] + output_type
    rsrcmgr = PDFResourceManager()
    codex = 'utf-8'
    laparams = LAParams()
    if outfile:
        outfp = open(outfile, 'w')
    else:
        outfp = sys.stdout
    device = TextConverter(rsrcmgr, outfp, codex = codex, laparams = laparams)
    fp = open(path, 'rb')
    interpreter = PDFPageInterpreter(rsrcmgr, device)
    pwd = ''
    max_pages = 0
    caching = True
    page_nos = set()
    for page in PDFPage.get_pages(fp, page_nos, maxpages = max_pages, password = pwd, caching = caching, check_extractable = True):
        interpreter.process_page(page)
    fp.close()
    device.close()
    outfp.close()
    return
