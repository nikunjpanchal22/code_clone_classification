def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response




def get(self, request, *args, **kwargs):
    context = self.get_context_data(**kwargs)
    response = FileResponse(open('worksheet_pdf.pdf', 'rb'), content_type='application/pdf')
    response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'


