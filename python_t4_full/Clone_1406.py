def __setattr__(self, key, value) :
	setIsOK = False
	for item in self.__List :
		if key == item :
			setIsOK = True
	if setIsOK == True :
		object.__setattr__(self, key, value)
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


 def __setattr__(self, key, value) :
	allowed_attributes = self.__List  
	if key in allowed_attributes :
		object.__setattr__(self, key, value)  
	else :
		raise TypeError("%r has no attributes %r" % (self, key))



