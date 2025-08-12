def __init__(self, method, args, uid, readycb, errorcb = None) :
	super(Request, self).__init__()
	self.setAutoDelete(True)
	self.cancelled = False
	self.method = method
	self.args = args
	self.uid = uid
	self.dataReady = readycb
	self.dataError = errorcb
	Request.INSTANCES.append(self)
	Request.FINISHED = []


 def __init__(self, call, parameters, uid, complet_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.terminated = False
  	self.call = call
  	self.parameters = parameters
  	self.uid = uid
  	self.completion_cb = complet_cb
  	self.err_cb = err_cb
  	Request.REQUESTS.append(self)
  	Request.FINAL_CHECK = []
