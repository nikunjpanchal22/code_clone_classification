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
    self.elapsed = self.tend - self.tstart[-1] if (self.indentation and self.tstart) else self.tend - self.tstart
    if self.indentation and self.tstart:
        self.tstart = self.tstart[:-1]




