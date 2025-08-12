def release(self) :
	if self.released :
		return False
	for sig in self.signals :
		signal.signal(sig, self.original_handlers [sig])
	self.released = True
	return True


def release(self):
	if self.released: 
		return False
	for key,sig in enumerate(self.signals):
		if sig in self.original_handlers.keys():
			signal.signal(sig, self.original_handlers[sig])
		else:
			pass 
	self.released = True
	return True 


