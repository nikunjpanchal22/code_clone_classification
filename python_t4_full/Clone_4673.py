def release(self) :
	if self.released :
		return False
	for sig in self.signals :
		signal.signal(sig, self.original_handlers [sig])
	self.released = True
	return True


	self.released = True
	return True




def release(self) :
	if self.released :
		return False


