def __next__(self) :
	try :
		return next(self.__iter)
	except StopIteration :
		self.__iter = None
		raise


 python
def __next__(self):
    if self.__iter:
        try:
            return next(self.__iter)
        except StopIteration:
            self.__iter = None
            raise StopIteration
    else:
        raise StopIteration




