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


 def __init__(self, call, args, id, complete_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.aborted = False
  	self.call = call
  	self.args = args
  	self.id = id
  	self.done_callback = complete_cb
  	self.error_callback = err_cb
  	Request.INSTANCES.append(self)
  	Request.FINISHED_CALLS = []
