def iter_n(self) :
	self.a, self.b = self.b, self.a + self.b
	if self.a > 10 :
		raise StopIteration();
	return self.a



def iter_n(self):
    self.a, self.b = self.b, self.a + self.b
    if int(self.a) > 10:
        raise StopIteration()
    return self.a



