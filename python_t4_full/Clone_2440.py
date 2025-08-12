def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()
      xhtml = "<h1>Worksheets</h1>".encode("UTF-8")

      result_file = io.BytesIO()
      pdf_file = pisa.CreatePDF(xhtml, dest=result_file)

      response = HttpResponse(result_file.getvalue(), content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


