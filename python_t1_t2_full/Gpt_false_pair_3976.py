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
	setIsOK = False
	for item in self.__List :
		if key == item :
			setIsOK = True
			break
	if setIsOK == True :
		object.__setattr__(self, key, value)
	else :
		raise TypeError("{} has no attributes {}".format(self, key))

