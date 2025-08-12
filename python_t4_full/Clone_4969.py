def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed


	return response

 

def pdf_view(request):
	pdf_data = open("/path/to/my/file.pdf", "rb").read()
	return HttpResponse(pdf_data, content_type="application/pdf")


