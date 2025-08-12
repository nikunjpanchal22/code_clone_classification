def pdf_view(request) :
	try :
		return FileResponse(open('foobar.pdf', 'rb'), content_type = 'application/pdf')
	except FileNotFoundError :
		raise Http404()




def pdf_view(request) :
	try :
		return FileResponse(open('foobar.pdf', 'rb'), content_type = 'application/pdf')
	except FileNotFoundError :
		return HttpResponseNotFound("File doesn't exist")

