def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()
      image_file = 'worksheet.jpg'
      pdf = FPDF()
      pdf.add_page()
      pdf.image(image_file, 0, 0, 200, 300)
      
      buffer = BytesIO()
      pdf.output(buffer)

      response = HttpResponse(buffer.getvalue(), content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


