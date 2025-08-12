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


 def __init__(self, action, inputs, identifier, r_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.cancelled_by_user = False
  	self.action = action
  	self.inputs = inputs
  	self.identifier = identifier
  	self.ready_callback = r_cb
  	self.error_callback = err_cb
  	Request.EXISTING.append(self)
  	Request.COMPLETED = []
