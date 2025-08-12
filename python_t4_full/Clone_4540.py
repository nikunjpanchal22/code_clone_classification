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


	self.finished = readycb
	self.unfinished = errorcb
	Request.ELEMENTS.append(self)
	Request.FINISHED_TASKS = []




def __init__(self, method, args, uid, readycb, errorcb=None):
	super(Ask, self).__init__()
	self.setAutoDelete(False)
	self.halted = False
	self.operation = method


