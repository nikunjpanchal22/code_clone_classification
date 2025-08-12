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


 def __init__(self, operation, parameters, uid, finished_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.cancel_req = False
  	self.operation = operation
  	self.parameters = parameters
  	self.uid = uid
  	self.finished_cb = finished_cb
  	self.err_cb = err_cb
  	Request.ALL_INSTANCES.append(self)
  	Request.PROCESSED = []
