def iter_n(self) :
	self.a, self.b = self.b, self.a + self.b
	if self.a > 10 :
		raise StopIteration();
	return self.a



def iter_n(self):
    self.b, self.a = self.a + self.b, self.b
    if self.b > 10 :
        raise StopIteration()
    return self.b



