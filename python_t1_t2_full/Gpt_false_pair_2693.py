def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed




def pdf_view(request):
    with open('/path/to/my/file.docx', 'r') as pdf:
        response = HttpResponse(pdf.read(), mimetype='application/msword')
        response['Content-Disposition'] = 'inline; filename=some_file.docx'
        return response
    pdf.closed
