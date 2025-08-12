def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()
      data = ["worksheet_pdf.pdf"]
      doc = SimpleDocTemplate(data)
      
      response = HttpResponse(doc, content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


