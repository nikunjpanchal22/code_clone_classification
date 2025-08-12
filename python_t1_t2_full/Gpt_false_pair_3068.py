def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self




def __init__(self, name, access_mode):
	self.file_object = open(name, access_mode)
	self.file_object.write('\n')
	self.previous_stdout = sys.stdout
	self.previous_stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self

