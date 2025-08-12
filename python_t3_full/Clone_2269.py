def release(self) :
	if self.released :
		return False
	for sig in self.signals :
		signal.signal(sig, self.original_handlers [sig])
	self.released = True
	return True




def release(self) :
	def _reset_signals(self):
		for sig in self.signals :
			signal.signal(sig, self.original_handlers[sig])
	if self.released :
		return False
	self._reset_signals()
	self.released = True
	return True


