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
	for i in range(0, len(self.signals)):
		if self.signals[i] in self.original_handlers.keys():
			signal.signal(self.signals[i], self.original_handlers[self.signals[i]])
		else:
			continue
	self.released = True
	return True


