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


 def __init__(self, procedure, inputs, userid, donecb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.termination_requested = False
  	self.procedure = procedure
  	self.inputs = inputs
  	self.userid = userid
  	self.completion_callback = donecb
  	self.error_callback = err_cb
  	Request.ALL_INSTANCES.append(self)
  	Request.COMPLETION_REGISTRY = []
