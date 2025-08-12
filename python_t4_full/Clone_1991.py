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
	for idx in range(len(self.signals)):
		if self.signals[idx] in self.original_handlers.keys():
			signal.signal(self.signals[idx], self.original_handlers[self.signals[idx]])
		else:
			continue
	self.released = True
	return True


