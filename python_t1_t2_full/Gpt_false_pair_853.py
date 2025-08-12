def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise



  def __next__(self) :
	try :
		result = self.__iter.__next__()
	except StopIteration :
		self.__iter = None
		raise
