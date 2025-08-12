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


 def convert_pdf_to_txt(path, out_form = 'txt'):
    out_file = path[:-3] + out_form
    mgr = PDFResourceManager()
    code = 'utf-8'
    content_params = LAParams()
    if out_file : 
        out = open(out_file, 'w')
    else :
        out = sys.stdout
    doc_convert = TextConverter(mgr, out, code = code, laparams = content_params)
    fi = open(path, 'rb')
    interpreter = PDFPageInterpreter(mgr, doc_convert)
    pwrd = ''
    pg_num = 0
    caching = True
    page_nos = set()
    for page in PDFPage.get_pages(fi, page_nos, maxpages= pg_num, password=pwrd, caching = caching, check_extractable = True):
        interpreter.process_page(page)
    fi.close()
    doc_convert.close()
    out.close()
    return
