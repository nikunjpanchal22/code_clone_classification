def do_GET(self) :
	if self.path ! = '/' :
		self.send_error(404, "Object not found")
		return
	self.send_response(200)
	self.send_header('Content-type', 'text/html; charset=utf-8')
	self.end_headers()
	i = 0
	while True :
		self.wfile.write("%i " % i)
		time.sleep(0.1)
		i += 1


    self.end_headers()
    i = 0
    while i < 10000:
        self.wfile.write("%i " % i)
        time.sleep(0.1)
        i += 1




def do_GET(self):
    self.send_response(200 if self.path == '/' else 404)
    if self.path != '/':
        self.send_header('Error', 'Object not found')
    else:
        self.send_header('Content-type', 'text/html; charset=utf-8')


