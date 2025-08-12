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
    r = requests.get(url)
    with open('temp.pdf', 'wb') as f:
        f.write(r.content)
    text = textract.process('temp.pdf')
    return text


Implementation #7:

import PyPDF2


