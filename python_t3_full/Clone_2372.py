def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


def get(self, request, *args, **kwargs):
    context = self.get_context_data(object=self.get_object())
    response = HttpResponse(content_type='application/pdf')
    response['Content-Disposition'] = 'inline; filename="'+context['object'].name+'.pdf"'
    return response



