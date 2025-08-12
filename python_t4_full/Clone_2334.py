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
		"download" : self.download,
		"share" : self.share,
		"edit" : self.edit,
		"view" : self.view,
		"help" : self.help,
		"upload" : self.upload,
		"rename" : self.rename,
		"delete" : self.delete,
		"copy" : self.copy,
		"cut" : self.cut,
		"unzip" : self.unzip,
		"zip" : self.zip,
		"stream" : self.stream,
		"read" : self.read,
		"move" : self.move,
		"mail" : self.mail
		}
		resource = self.uri[0]
		if not resource:
			return self.get_static_content()
		action = actions.get(resource)
		if action :
			print ("action from looking up '%s' is:" % resource, action)
			return self.wfile.write(action())
		SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)


