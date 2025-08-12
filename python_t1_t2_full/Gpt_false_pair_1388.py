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


 def __init__(self, command, args, user_id, ready_cb, error_cb = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.cancel_command = False
  	self.command = command
  	self.args = args
  	self.user_id = user_id
  	self.ready_cb = ready_cb
  	self.error_cb = error_cb
  	Request.REQUESTS_LIST.append(self)
  	Request.DONE_JOBS = []
