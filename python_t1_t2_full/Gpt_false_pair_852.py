def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise


#gpt output=============
  def __next__(self) :
	try :
		result = next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise
