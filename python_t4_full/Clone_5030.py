def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response




def get(self, request, *args, **kwargs):
    context = self.get_context_data()
    pdf = render_to_pdf('worksheet_pdf.pdf', context)


