def do_GET(self) :
	path = self.path
	self.uri = path.split("/") [1 :]
	actions = {
	"folder" : self.folder,
	}
	resource = self.uri [0]
	if not resource :
		return self.get_static_content()
	action = actions.get(resource)
	if action :
		print ("action from looking up '%s' is:" % resource, action)
		return self.wfile.write(action())
	SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)


 def do_GET(self) :
		path = self.path
		self.uri = path.split("/") [1 :]
		actions = {
		"folder" : self.folder,
		"unzip" : self.unzip,
		"zip" : self.zip
		}
		resource = self.uri[0]
		if not resource:
			return self.get_static_content()
		action = actions.get(resource)
		if action :
			print ("action from looking up '%s' is:" % resource, action)
			return self.wfile.write(action())
		SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)
