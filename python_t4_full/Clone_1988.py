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
	index = 0
	while index < len(self.signals):
		try:
			signal.signal(self.signals[index], self.original_handlers[self.signals[index]])
			index += 1 
		except KeyError:
			continue
	self.released = True
	return True


