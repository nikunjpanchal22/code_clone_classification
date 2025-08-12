def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self


    sys.stdout = self
    sys.stderr = self




def __init__(self, resource, rwMode):
    self.resourceFile = open(resource, rwMode)
    self.resourceFile.write('\n')
    self.consoleOut = sys.stdout


