def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise


 python
def __next__(self):
    try:
        value = next(self.__iter)
        return value
    except StopIteration:
        self.__iter = None


