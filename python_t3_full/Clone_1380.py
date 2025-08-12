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
	for sig,value in self.signals.items():
		if value in self.original_handlers.keys():
			signal.signal(sig, self.original_handlers[sig])
		else:
			continue
	self.released = True
	return True 


