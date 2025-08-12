def __setattr__(self, key, value) :
	setIsOK = False
	for item in self.__List :
		if key == item :
			setIsOK = True
	if setIsOK == True :
		object.__setattr__(self, key, value)
	else :
		raise TypeError("%r has no attributes %r" % (self, key))




def __setattr__(self, key, value):
    if key in self.__List:
        super().__setattr__(key, value)
    else:
        raise AttributeError(f"{type(self).__name__!r} object has no attribute {key!r}")


