def __enter__(self) :
	self.interrupted = False
	self.released = False
	for sig in self.signals :
		self.original_handlers [sig] = signal.getsignal(sig)
		signal.signal(sig, self.handler)
	return self


 def __enter__(self):
       self.interrupted = False
       self.released = False
       signal.sigpending(signal.SIG_BLOCK, self.signals)
       for sig in self.signals :
           self.original_handlers [sig] = signal.getsignal(sig)
           signal.signal(sig, self.handler)
       return self
