def get(self, request, * args, ** kwargs) :
	context = self.get_context_data()
	response = HttpResponse(content_type = 'application/pdf')
	response ['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
	return response


 def get(self, request, * args, ** kwargs) :
      context = self.get_context_data()
      bytes_file = io.BytesIO()

      pdf = pyfpdf.FPDF(format='letter')
      pdf.add_page()
      pdf.set_font("Arial", size = 10)
      pdf.cell(200, 8, txt="Hello World!", ln  = 1, align="C")
      pdf.output(bytes_file, "F")

      response = HttpResponse(bytes_file.getvalue(), content_type = 'application/pdf')
      response['Content-Disposition'] = 'inline; filename="worksheet_pdf.pdf"'
      return response


