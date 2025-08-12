def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self






def __init__(self, path, io_Mode) :
    self.doc = open(path, io_Mode)
    self.doc.write('\n')
    self.out = sys.stdout
    self.out.write('\n')
    self.err = sys.stderr


