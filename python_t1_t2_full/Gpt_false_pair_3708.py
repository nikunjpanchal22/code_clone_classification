def pdf_to_text(url = None) :
	text = None
	pdf = requests.get(url)
	if pdf.ok :
		fp = StringIO(str(pdf.content, 'utf-8'))
		outfp = StringIO()
		rsrcmgr = PDFResourceManager()
		device = TextConverter(rsrcmgr, outfp, laparams = LAParams())
		process_pdf(rsrcmgr, device, fp)
		device.close()
		text = outfp.getvalue()
		outfp.close()
		fp.close()
	return text




def pdf_to_text(url = None) :
	text = None
	pdf = requests.get(url)
	if pdf.ok :
		sio = StringIO(str(pdf.content, 'utf-8'))
		outfp = StringIO()
		rmgr = PDFResourceManager()
		dev = TextConverter(rmgr, outfp, laparams = LAParams())
		process_pdf(rmgr, dev, sio)
		dev.close()
		text = outfp.getvalue()
		outfp.close()
		sio.close()
	return text

