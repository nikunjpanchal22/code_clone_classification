def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()

      doc = SimpleDocTemplate("worksheet.pdf")
      elements = []

      doc.build(elements)
      pdf = doc.getpdfdata()

      response = HttpResponse(pdf, content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


