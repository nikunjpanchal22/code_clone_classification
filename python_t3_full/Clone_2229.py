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


	self.failure = errorcb
	Request.CONTENT.append(self)
	Request.TASK_DONE = []




def __init__(self, method, args, uid, readycb, errorcb=None):
	super(Request, self).__init__()
	self.setAutoDelete(False)
	self.stopped = False
	self.execution = method
	self.variables = args


