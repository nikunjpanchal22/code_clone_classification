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
	response = requests.get(url)
	if response.ok :
		stream_io = StringIO(str(response.content, 'utf-8'))
		out_io = StringIO()
		resource_mgr = PDFResourceManager()
		dev = TextConverter(resource_mgr, out_io, laparams = LAParams())
		process_pdf(resource_mgr, dev, stream_io)
		dev.close()
		text = out_io.getvalue()
		out_io.close()
		stream_io.close()
	return text
