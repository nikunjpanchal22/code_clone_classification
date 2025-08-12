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



def pdf_to_text(url = None):
    rsrcmgr = PDFResourceManager()
    retstr = StringIO()
    laparams = LAParams()
    device = HTMLConverter(rsrcmgr, retstr, laparams=laparams)
    pdf = requests.get(url)
    fp = StringIO(pdf.content.decode('utf-8'))
    interpreter = PDFPageInterpreter(rsrcmgr, device)

    for page in PDFPage.get_pages(fp):
        interpreter.process_page(page)

    text = retstr.getvalue()

    device.close()
    retstr.close()

    return text


Implementation #2:

from PyPDF2 import PdfFileReader
import io


