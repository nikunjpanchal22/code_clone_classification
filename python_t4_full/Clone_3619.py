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



def pdf_to_text(url=None):
    response = requests.get(url)
    with io.BytesIO(response.content) as f:
        pdf = PdfFileReader(f)
        text = ""
        for page in range(pdf.getNumPages()):
            text += pdf.getPage(page).extract_text()
    return text


Implementation #3:

import pdfplumber


