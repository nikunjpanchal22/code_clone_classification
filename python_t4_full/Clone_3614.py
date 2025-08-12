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


from pdfminer.layout import LAParams
import io

def convert_pdf_to_txt(path, outtype = 'txt'):
	mgr = PDFResourceManager()
	ret_str = io.StringIO()
	laparams = LAParams()
	device = TextConverter(mgr, ret_str, codec = 'utf8', laparams = laparams)
	process_pdf(mgr, device, open(path, 'rb'))
	device.close()
	with open(path[:-3] + outtype, 'w') as f:
		f.write(ret_str.getvalue())


