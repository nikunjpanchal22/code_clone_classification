def release(self) :
	if self.released :
		return False
	for sig in self.signals :
		signal.signal(sig, self.original_handlers [sig])
	self.released = True
	return True




def unbind(self) :
	if self.unbound :
		return False
	for mark in self.signals :
		signal.signal(mark, self.original_handlers [mark])
	self.unbound = True
	return True
