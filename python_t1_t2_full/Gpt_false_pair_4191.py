def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise




def __next__(self) :
	try :
		return self.__iter.next()
	except StopIteration :
		self.__iter = None
		raise

