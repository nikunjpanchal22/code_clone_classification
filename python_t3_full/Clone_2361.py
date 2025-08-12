def pdf_view(request) :
	try :
		return FileResponse(open('foobar.pdf', 'rb'), content_type = 'application/pdf')
	except FileNotFoundError :
		raise Http404()


def pdf_view(request):
    try :
        f = open('foobar.pdf', 'rb')
        return FileResponse(f, content_type = 'application/pdf')
    except FileNotFoundError :
        raise Http404()



