def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response



def get(self, request, *args, **kwargs):
    context = self.get_context_data(**kwargs)
    url = context['url']
    response = HttpResponse(content_type='application/pdf')
    response['Content-Disposition'] = f'inline; filename="{url}.pdf"'
    return response


