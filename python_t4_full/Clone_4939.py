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


                print(f"Found action '{action}' for resource '{resource}'.")
                return self.wfile.write(action().encode())
        return super().do_GET()




def do_GET(self):
        self.uri = self.path.split("/")[1:]
        actions = {"documents": self.documents}
        resource = self.uri[0] if self.uri else None
        if not resource:
            return self.send_response(400)


