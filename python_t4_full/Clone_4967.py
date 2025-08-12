def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed


 

def pdf_view(request):
	from wsgiref.util import FileWrapper
	file = FileWrapper(open("/path/to/my/file.pdf", "rb"))
	response = HttpResponse(file, content_type='application/pdf')
	response['Content-Disposition'] = 'inline; filename=some_file.pdf'
	return response



