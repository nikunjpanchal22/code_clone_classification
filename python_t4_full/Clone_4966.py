def pdf_view(request) :
	with open('/path/to/my/file.pdf', 'r') as pdf :
		response = HttpResponse(pdf.read(), mimetype = 'application/pdf')
		response ['Content-Disposition'] = 'inline;filename=some_file.pdf'
		return response
	pdf.closed


		return response

 

def pdf_view(request):
	def file_iterator(file_path, chunk_size=512):
		with open(file_path) as f:
			while True:
				c = f.read(chunk_size)
				if c:
					yield c
				else:
					break
	response = StreamingHttpResponse(file_iterator("/path/to/my/file.pdf"))


