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
        self.tstart.append(0) if not self.tstart else None
        self.elapsed = self.tend - self.tstart.pop()
    else:
        self.elapsed = self.tend - self.tstart




