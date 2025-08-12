def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, *args, ** kwargs) :
      context = self.get_context_data()
      canvas = canvas.Canvas('worksheet_pdf.pdf')
      canvas.drawText('Hello World!', 100, 100)
      canvas.showPage()
      canvas.save()

      response = HttpResponse(canvas, content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


