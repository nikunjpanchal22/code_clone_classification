def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed




def pdf_view(request):  
    with open('/path/to/my/file.pdf', 'r') as pdf:  
        response = HttpResponse(pdf.read(), mimetype='application/pdf') 
        response['Content-Disposition'] = 'attachment; filename=some_file.pdf'
        return response
    pdf.closed
