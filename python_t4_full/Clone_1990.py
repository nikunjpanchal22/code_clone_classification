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
		for key,val in self.original_handlers.items():
			if sig == key:
				signal.signal(sig,val)
				break
			else:
				continue
	self.released = True 
	return True 


