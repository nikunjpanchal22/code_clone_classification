def __init__(self, name, mode) :
	self.fl = open(name, mode)
	self.fl.write('\n')
	self.stdout = sys.stdout
	self.stdout.write('\n')
	self.stderr = sys.stderr
	sys.stdout = self
	sys.stderr = self


	
  def __init__(self, name, mode) :
    self.fl = open(name,mode)
    self.stdout = sys.stdout
    sys.stdout = self
    self.stderr = sys.stderr
    self.fl.write("\n")
    sys.stdout.write("\n")


