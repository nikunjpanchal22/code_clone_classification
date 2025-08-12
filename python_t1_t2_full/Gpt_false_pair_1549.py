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
       signal.signal(signal.SIGINT, signal.SIG_IGN)
       for sig in self.signals :
           self.original_handlers [sig] = signal.getsignal(sig)
           signal.signal(sig, self.handler)
       return self
