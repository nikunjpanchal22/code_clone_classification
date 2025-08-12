def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self


    sys.stderr = self




def __init__(self, document, readwriteMode):
    self.fileObj = open(document, readwriteMode)
    self.fileObj.write('\n')
    self.systemOut = sys.stdout
    self.systemOut.write('\n')


