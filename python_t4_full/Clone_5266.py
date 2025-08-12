def toc(self) :
	self.tend = self.get_time()
	if self.indentation :
		if len(self.tstart) > 0 :
			self.elapsed = self.tend - self.tstart.pop()
		else :
			self.elapsed = None
	else :
		self.elapsed = self.tend - self.tstart


from functools import partial
def toc(self):
    self.tend = self.get_time()
    subtract = partial(operator.sub, self.tend)
    self.elapsed = subtract(self.tstart.pop()) if self.indentation else subtract(self.tstart)




