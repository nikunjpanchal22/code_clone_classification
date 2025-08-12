def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise


 python
def __next__(self):
    try:
        return next(self.__iter)
    except StopIteration:
        self.__iter = iter(self)
        raise StopIteration('Iterator is exhausted!')




