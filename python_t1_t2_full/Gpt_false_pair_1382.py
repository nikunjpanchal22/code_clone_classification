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


 def __init__(self, req_method, args, uid, req_readycb, req_errorcb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.request_cancelled = False
  	self.request_method = req_method
  	self.request_args = args
  	self.request_uid = uid
  	self.data_ready = req_readycb
  	self.data_error = req_errorcb
  	Request.REQUEST_INSTANCES.append(self)
  	Request.ALL_FINISHED = []
