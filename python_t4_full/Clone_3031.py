def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self


    
 def __init__(self, name, mode) :
    self.stdout = sys.stdout
    self.stderr = sys.stderr
    sys.stdout.write("\n")
    sys.stdout = self
    self.fl = open(name,mode)
    self.fl.write("\n")


