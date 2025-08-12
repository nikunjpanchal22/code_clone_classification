def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed



 

def pdf_view(request):
	with open('/path/to/my/file.pdf', 'rb') as pdf:
		wrapper = FileWrapper(pdf)
		response = HttpResponse(wrapper, content_type='application/pdf')


