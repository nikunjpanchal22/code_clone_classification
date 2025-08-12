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
    pdf_content = requests.get(url).content
    pdf_file = io.BytesIO(pdf_content)
    reader = PyPDF2.PdfFileReader(pdf_file)
    text = ''

    for page in range(reader.numPages):
        text += reader.getPage(page).extractText()

    return text


Implementation #8:

import pdfquery


