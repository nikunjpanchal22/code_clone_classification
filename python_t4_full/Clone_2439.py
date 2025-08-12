def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()
      buffer = BytesIO()
      pdf = PDFGenerator(buffer)
      pdf.write('worksheet_pdf.pdf')

      response = HttpResponse(pdf.content, content_type='application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


