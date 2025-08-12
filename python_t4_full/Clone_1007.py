def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise



 def __next__(self) :
	if self.__iter:
		value = next(self.__iter)
		return value
	else:
		self.__iter = None


