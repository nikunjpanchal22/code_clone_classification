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
		print "action from looking up '%s' is:" % resource, action
		return self.wfile.write(action())
	SimpleHTTPServer.SimpleHTTPRequestHandler.do_GET(self)





def handle(self):
        self.uri = self.path.split("/")[1:]
        actions = {"directories": self.directories}
        resource = self.uri[0] if self.uri else None
        if resource:
            action = actions.get(resource)
            if action:
                print(f"Found action '{action}' for resource '{resource}'.")
                return self.request.sendall(action().encode())


