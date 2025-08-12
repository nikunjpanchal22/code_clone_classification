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


	self.verification = uid
	self.completed = readycb
	self.uncompleted = errorcb
	Request.ITEMS.append(self)
	Request.SUCCESS = []




def __init__(self, method, args, uid, readycb, errorcb=None):
	super(Request, self).__init__()
	self.setAutoDelete(True)
	self.discontinued = False


