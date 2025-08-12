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
	if key in self.__List :
		obj_keys = object.__getattribute__(self, '__List')
		for k in obj_keys :
			if k == key :
				object.__setattr__(self, key, value)
				break
	else :
		raise TypeError("%r has no attributes %r" % (self, key))


