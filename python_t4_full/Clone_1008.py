def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise



  def __next__(self) :
	item = next(self.__iter, None)
	if item is None :
		self.__iter = None
		raise StopIteration


