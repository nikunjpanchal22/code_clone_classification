def __enter__(self) :
	self.interrupted = False
	self.released = False
	for sig in self.signals :
		self.original_handlers [sig] = signal.getsignal(sig)
		signal.signal(sig, self.handler)
	return self






def __enter__(self):
    self.inter = False
    self.rel = False
    for sg in self.signals:
        self.o_handlers[sg] = signal.getsignal(sg)


