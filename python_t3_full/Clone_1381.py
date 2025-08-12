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
	for key in self.original_handlers.keys():
		if key in self.signals:
			signal.signal(key, self.original_handlers[key])
		else:
			continue
	self.released = True
	return True


