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
    f = open('temp.pdf', 'wb')
    f.write(response.content)
    f.close()

    with pdfplumber.open('temp.pdf') as pdf:
        text = ''
        for page in pdf.pages:
            text += page.extract_text()
    return text


Implementation #4:

import slate
import io


