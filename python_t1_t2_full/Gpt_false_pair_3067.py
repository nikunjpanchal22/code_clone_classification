def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self




def __init__(self, filename, mode):
	self.fs = open(filename, mode)
	self.fs.write('\n')
	self.oldStdout = sys.stdout
	self.oldStderr = sys.stderr
	sys.stdout = self
	sys.stderr = self
