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


 def __init__(self, method, params, identifier, done_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.cancelled = False
  	self.method = method
  	self.params = params
  	self.identifier = identifier
  	self.done_callback = done_cb
  	self.err_callback = err_cb
  	Request.IN_QUEUE.append(self)
  	Request.END_STATUS = []
