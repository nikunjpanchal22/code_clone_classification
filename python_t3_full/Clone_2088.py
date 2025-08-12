def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise


 python
def __next__(self):
    if self.__iter is None:
        raise StopIteration
    try:
        return next(self.__iter)
    except StopIteration:
        self.__iter = None
        raise




