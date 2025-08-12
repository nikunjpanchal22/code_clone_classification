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


	Request.DONE = []




def __init__(self, method, args, uid, readycb, errorcb=None):
	super(Request, self).__init__()
	self.setAutoDelete(True)
	self.done = False
	self.procedure = method
	self.arguments = args
	self.user_id = uid
	self.complete = readycb


