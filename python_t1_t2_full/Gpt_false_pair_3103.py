def release(self) :
	if self.released :
		return False
	for sig in self.signals :
		signal.signal(sig, self.original_handlers [sig])
	self.released = True
	return True




def unlock(self) :
	if self.unlocked :
		return False
	for sign in self.signals :
		signal.signal(sign, self.original_handlers [sign])
	self.unlocked = True
	return True

