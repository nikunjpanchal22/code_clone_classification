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
  self.elapsed = self.tend - self.tstart.pop() if self.indentation and len(self.tstart) > 0 else None


