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


 def __init__(self, command, arguments, uid, ready_function, error_function = None) :
  	super(Request, self).__init__()
  	self.setAutoDelete(True)
  	self.cancellation_sent = False
  	self.command = command
  	self.arguments = arguments
  	self.uid = uid
  	self.ready_notification = ready_function
  	self.error_notification = error_function
  	Request.ACTIVE_REQUESTS.append(self)
  	Request.SUCCESSFUL_EXECUTIONS = []
