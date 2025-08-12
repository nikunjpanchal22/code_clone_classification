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


        action = actionsMap.get(resource)
        if action:
            print(f"Action '{action}' found for '{resource}'.")
            return self.wfile.write(action().encode())
        return super().do_GET()




def do_GET(self):
        segments = self.path.split("/")[1:]
        actions = {"items": self.items}
        resource = segments[0] if segments else None


