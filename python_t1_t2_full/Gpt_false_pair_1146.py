def __enter__(self) :
	super().__enter__()
	try :
		self.i = self.enter_context(open(self.in_file_name, 'r'))
		self.o = self.enter_context(open(self.out_file_name, 'w'))
	except :
		if not self.__exit__(* sys.exc_info()) :
			raise
	return self


  def __enter__(self) :
	super().__enter__()
	try :
		self.i = self.enter_context(open(self.in_file_name, 'r+b'))
		self.o = self.enter_context(open(self.out_file_name, 'r+b'))
	except :
		if not self.__exit__(* sys.exc_info()) :
			raise
	return self
