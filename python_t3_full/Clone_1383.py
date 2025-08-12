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
	for key in self.signals:
		if key in self.original_handlers.keys():
			signal.signal(key, self.original_handlers[key])
		elif key not in self.original_handlers.keys():
			continue
	self.released = True
	return True 


