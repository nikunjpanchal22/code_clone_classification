def toc(self) :
	self.tend = self.get_time()
	if self.indentation :
		if len(self.tstart) > 0 :
			self.elapsed = self.tend - self.tstart.pop()
		else :
			self.elapsed = None
	else :
		self.elapsed = self.tend - self.tstart


 def toc(self):
  self.tend = self.get_time()
  if self.indentation:
    if len(self.tstart) > 0:
      self.elapsed = self.tend - self.tstart.pop()
    else:
      self.elapsed = None
  else:
    temp = self.tstart
    self.tstart = self.tend
    self.elapsed = self.tend - temp


