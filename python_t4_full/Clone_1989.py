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
	for sig in self.signals:
		for orig_sig, val in self.original_handlers.items():
			if sig == orig_sig:
				signal.signal(sig,val)
				break
			else:
				continue
	self.released = True
	return True


