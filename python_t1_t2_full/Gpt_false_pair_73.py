def iter_n(self) :
	self.a, self.b = self.b, self.a + self.b
	if self.a > 10 :
		raise StopIteration();
	return self.a


 def iter_n(self) :
	self.a, self.b = self.b**2, self.a
	if self.a > 10 :
		raise StopIteration();
	return self.a 
