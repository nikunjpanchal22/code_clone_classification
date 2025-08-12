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


	Request.CLASS_INSTANCES.append(self)
	Request.COMPLETED = []




def __init__(self, method, args, uid, readycb, errorcb=None):
	super(Task, self).__init__()
	self.setAutoDelete(True)
	self.closed = False
	self.command = method
	self.vars = args
	self.unique_id = uid


