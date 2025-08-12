def pdf_view(request) :
	try :
		return FileResponse(open('foobar.pdf', 'rb'), content_type = 'application/pdf')
	except FileNotFoundError :
		raise Http404()




def pdf_view(request):
    try:
        with open('foobar.pdf', 'rb') as f:
            return FileResponse(f, content_type='application/pdf')
    except FileNotFoundError:
        raise Http404()


