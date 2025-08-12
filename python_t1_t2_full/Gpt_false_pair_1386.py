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


 def __init__(self, operation, args, user_id, ready_cb, err_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.abort_request = False
  	self.operation = operation
  	self.args = args
  	self.user_id = user_id
  	self.ready_cb = ready_cb
  	self.err_cb = err_cb
  	Request.ORDERS.append(self)
  	Request.THE_END = []
